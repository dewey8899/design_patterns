package com.dewey.design_patterns.type.behavioral.visitor;

/**
 * @author dewey
 * @date 2023/9/25 23:07
 * @function 功能描述
 * 抽象访问者
 */
public interface Visitor {

    //访问哪个元素，元素作为参数
    void visit(ConcreteElements1 elements);
    void visit(ConcreteElements2 elements);
}
