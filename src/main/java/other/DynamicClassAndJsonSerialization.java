package other;

/**
 * @author dewey
 * @date 2023/9/28 23:07
 * @function 功能描述
 */


import com.fasterxml.jackson.databind.ObjectMapper;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class DynamicClassAndJsonSerialization {
    public static void main(String[] args) {
        // 参数和数据类型的映射（模拟数据库中的参数和数据类型）
        Map<String, String> parameterMap = new HashMap<>();
        parameterMap.put("name", "String");
        parameterMap.put("age", "int");

        // 生成动态类并赋值
        try {
            Class<?> dynamicClass = generateDynamicClass("DynamicPerson", parameterMap);
            Object dynamicObject = dynamicClass.newInstance();

            // 给动态类的字段赋值
            setFieldValue(dynamicObject, "name", "John");
            setFieldValue(dynamicObject, "age", 30);

            // 使用Jackson库将对象序列化为JSON
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writeValueAsString(dynamicObject);

            System.out.println("JSON Representation:");
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 生成动态类
    private static Class<?> generateDynamicClass(String className, Map<String, String> parameterMap) throws Exception {
        ClassLoader classLoader = DynamicClassAndJsonSerialization.class.getClassLoader();
        DynamicClassLoader dynamicClassLoader = new DynamicClassLoader(classLoader);

        // 构建类的字符串表示
        StringBuilder classDefinition = new StringBuilder();
        classDefinition.append("public class ").append(className).append(" {\n");

        for (Map.Entry<String, String> entry : parameterMap.entrySet()) {
            String fieldName = entry.getKey();
            String fieldType = entry.getValue();
            classDefinition.append("    private ").append(fieldType).append(" ").append(fieldName).append(";\n");

            // 自动生成getter和setter方法
            classDefinition.append("    public ").append(fieldType).append(" get").append(capitalize(fieldName)).append("() {\n");
            classDefinition.append("        return ").append(fieldName).append(";\n");
            classDefinition.append("    }\n");

            classDefinition.append("    public void set").append(capitalize(fieldName)).append("(").append(fieldType).append(" ").append(fieldName).append(") {\n");
            classDefinition.append("        this.").append(fieldName).append(" = ").append(fieldName).append(";\n");
            classDefinition.append("    }\n");
        }

        classDefinition.append("}");

        // 使用自定义类加载器加载动态类
        return dynamicClassLoader.defineClass(className, classDefinition.toString());
    }

    // 设置字段值
    private static void setFieldValue(Object object, String fieldName, Object value) throws Exception {
        Field field = object.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(object, value);
    }

    // 辅助函数：将字符串的首字母大写
    private static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}

