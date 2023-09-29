package other;

/**
 * @author dewey
 * @date 2023/9/28 23:07
 * @function 功能描述
 */


import cn.hutool.json.JSONUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.tuple.Triple;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DynamicClassAndJsonSerialization {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dateStr = "2021-08-19";
        LocalDate date = LocalDate.parse(dateStr, fmt);

        // 参数和数据类型的映射（模拟数据库中的参数和数据类型）
        List<Triple<String, String, Object>> listTriple = new ArrayList<>();
        listTriple.add(Triple.of("city", "String", "石家庄市"));
        listTriple.add(Triple.of("ifNewCar", "Integer", 0));
        listTriple.add(Triple.of("channel", "String", "石家庄市"));
        listTriple.add(Triple.of("idc", "String", "身份证号"));
        listTriple.add(Triple.of("productCode", "String", "石家庄市"));
        listTriple.add(Triple.of("province", "String", "河北省"));
        listTriple.add(Triple.of("createTime", "LocalDate", LocalDate.parse("2023-03-21", fmt)));
        listTriple.add(Triple.of("phone", "String", "13052226566"));
        listTriple.add(Triple.of("vehicleMode", "String", "F7"));
        listTriple.add(Triple.of("fromTime", "LocalDate", LocalDate.parse("2023-03-21", fmt)));
        listTriple.add(Triple.of("name", "String", "周杰伦"));
        listTriple.add(Triple.of("vin", "String", "LFMA1ACC600216052"));
        listTriple.add(Triple.of("brand", "String", "飞凡"));
        listTriple.add(Triple.of("toTime", "LocalDate", LocalDate.parse("2024-09-21", fmt)));
        listTriple.add(Triple.of("transSerialNo", "String", "ef127464reuwtyi-fjdslfjls672139-8877-wopeiu"));

        // 生成动态类并赋值
        try {
            Class<?> dynamicClass = generateDynamicClass("DynamicPerson", listTriple);
            Object dynamicObject = dynamicClass.newInstance();

            listTriple.forEach(s->{
                try {
                    //给动态类的字段赋值
                    setFieldValue(dynamicObject, s.getLeft(), s.getRight());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            // 使用Jackson库将对象序列化为JSON
            JSONUtil.toJsonStr(dynamicObject);
            System.out.println("序列化为JSON: ");
            System.out.println(JSONUtil.toJsonStr(dynamicObject));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 生成动态类
    private static Class<?> generateDynamicClass(String className, List<Triple<String, String, Object>> listTriple) throws Exception {
        ClassLoader classLoader = DynamicClassAndJsonSerialization.class.getClassLoader();
        DynamicClassLoader dynamicClassLoader = new DynamicClassLoader(classLoader);

        // 构建类的字符串表示
        StringBuilder classDefinition = new StringBuilder();
        classDefinition.append("import java.time.LocalDate;");
        classDefinition.append("import java.math.BigDecimal;");
        classDefinition.append("public class ").append(className).append(" {\n");
        for (Triple<String, String, Object> triple : listTriple) {
            String fieldName = triple.getLeft();
            String fieldType = triple.getMiddle();
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

