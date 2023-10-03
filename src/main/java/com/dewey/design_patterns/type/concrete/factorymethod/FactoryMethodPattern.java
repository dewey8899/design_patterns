package com.dewey.design_patterns.type.concrete.factorymethod;

/**
 * @author dewey
 * @date 2023/9/29 22:46
 * @function 功能描述
 */
public class FactoryMethodPattern {
    public static void main(String[] args) {
        Application application = new CreateProductA();
        application.getProduct().method();

        application = new CreateProductB();
        application.getProduct().method();

    }
}
