package other;

/**
 * @author dewey
 * @date 2023/9/28 23:29
 * @function 功能描述
 */
import javax.tools.*;
import java.io.*;
import java.net.URI;
import java.util.Collections;

public class DynamicClassLoader extends ClassLoader {
    public DynamicClassLoader(ClassLoader parent) {
        super(parent);
    }

    public Class<?> defineClass(String name, String classDefinition) throws Exception {
        // 获取编译器
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

        // 创建一个内存中的源文件
        JavaFileObject sourceFile = new JavaSourceFromString(name, classDefinition);

        // 创建一个内存中的输出文件
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        JavaFileManager fileManager = new ForwardingJavaFileManager<JavaFileManager>(
                compiler.getStandardFileManager(null, null, null)) {
            @Override
            public JavaFileObject getJavaFileForOutput(
                    Location location, String className, JavaFileObject.Kind kind, FileObject sibling) {
                return new SimpleJavaFileObject(URI.create("string:///" + className.replace('.', '/') + kind.extension),
                        kind) {
                    @Override
                    public OutputStream openOutputStream() {
                        return byteArrayOutputStream;
                    }
                };
            }
        };

        // 编译源代码
        JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, null, null, null, Collections.singletonList(sourceFile));
        boolean success = task.call();
        if (!success) {
            throw new RuntimeException("Compilation failed");
        }

        // 定义类
        byte[] bytecode = byteArrayOutputStream.toByteArray();
        return defineClass(name, bytecode, 0, bytecode.length);
    }

    // 用于在内存中创建源文件的辅助类
    private static class JavaSourceFromString extends SimpleJavaFileObject {
        final String code;

        JavaSourceFromString(String name, String code) {
            super(URI.create("string:///" + name.replace('.', '/') + Kind.SOURCE.extension), Kind.SOURCE);
            this.code = code;
        }

        @Override
        public CharSequence getCharContent(boolean ignoreEncodingErrors) {
            return code;
        }
    }
}

