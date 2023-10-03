package com.dewey.design_patterns.type.concrete.factorymethod;

/**
 * @author dewey
 * @date 2023/9/29 22:48
 * @function 功能描述
 */
public class CreateProductA implements Application{
    @Override
    public Product getProduct() {
        return new ProductA();
    }
}
