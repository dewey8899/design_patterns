package com.dewey.design_patterns.visitor;

/**
 * @author dewey
 * @date 2023/9/25 23:07
 * @function 功能描述
 * 抽象元素
 */
public interface Elements {

    //接收谁的访问，访问者作为参数传递进来
    void accept(Visitor visitor);
}
