package com.dewey.design_patterns.visitor;

/**
 * @author dewey
 * @date 2023/9/25 23:13
 * @function 功能描述
 * 具体元素
 */
public class ConcreteElements2 implements Elements{

    //元素接收访问
    @Override
    public void accept(Visitor visitor) {
        //当前元素接受visitor的访问
        visitor.visit(this);
    }

    public void operator2(){
        System.out.println("元素2");
    }
}
