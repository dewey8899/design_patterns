package com.dewey.design_patterns.interpret;

/**
 * @author dewey
 * @date 2023/9/24 18:54
 * 抽象表达式
 */
public interface AbstractExpression {

    //接收某个输入的信息
    boolean interpret(String info);
}
