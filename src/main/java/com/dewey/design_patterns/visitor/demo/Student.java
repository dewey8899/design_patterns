package com.dewey.design_patterns.visitor.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author dewey.du
 * @Date 2023/9/26 9:28
 * @Project design_patterns
 **/
@Slf4j
public class Student extends User {

    public Student(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }


    public int ranking() {
        return (int) (Math.random() * 100);
    }
}
