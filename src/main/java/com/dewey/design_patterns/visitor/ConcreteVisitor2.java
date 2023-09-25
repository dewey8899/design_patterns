package com.dewey.design_patterns.visitor;

/**
 * @author dewey
 * @date 2023/9/25 23:08
 * @function 功能描述
 * 具体访问者
 */
public class ConcreteVisitor2 implements Visitor{

    @Override
    public void visit(ConcreteElements1 elements) {
        System.out.print("具体访问者2访问-》");
        elements.operator1();
    }

    @Override
    public void visit(ConcreteElements2 elements) {
        System.out.print("具体访问者2访问-》");
        elements.operator2();
    }
}
