package com.dewey.design_patterns.type.behavioral.template;

/**
 * @author dewey
 * @date 2023/10/3 19:55
 * @function 功能描述
 */
public class TemplatePattern {
    public static void main(String[] args) {
        AbstractClass abstractClass = new SubClass1();
        abstractClass.operator();
    }
}
