package com.dewey.design_patterns.visitor.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author dewey.du
 * @Date 2023/9/26 9:38
 * @Project design_patterns
 * 数据结构
 **/
public class ObjectStructure {
    List<User> userList = new ArrayList<>();

    public void dataView() {
        userList.add(new Student("Ethan", "学生", "高一1班"));
        userList.add(new Student("Tom", "学生", "高一2班"));
        userList.add(new Student("Peter", "学生", "高一3班"));
        userList.add(new Teacher("张三", "老师", "高一1班"));
        userList.add(new Teacher("李四", "老师", "高一2班"));
        userList.add(new Teacher("王五", "老师", "高一3班"));
    }

    public void show(Visitor visitor) {
        for (User user : userList) {
            user.accept(visitor);
        }
    }

}
