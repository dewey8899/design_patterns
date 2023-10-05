package com.dewey.design_patterns.type.behavioral.visitor;

/**
 * @author dewey
 * @date 2023/9/25 23:06
 * @function 功能描述
 */
public class VisitorTest {
    public static void main(String[] args) {
        //创建结构对象
        ObjectStructure objectStructure = new ObjectStructure();
        //添加可以访问的元素
        ConcreteElements1 concreteElements1 = new ConcreteElements1();
        ConcreteElements2 concreteElements2 = new ConcreteElements2();
        objectStructure.add(concreteElements1);
        objectStructure.add(concreteElements2);
        //创建访问对象
        Visitor visitor = new ConcreteVisitor1();

        //结构对象接受visitor访问者的访问，遍历结构对象中存的所有元素接受访问
        objectStructure.accept(visitor);
        visitor = new ConcreteVisitor2();
        objectStructure.accept(visitor);
    }
}


