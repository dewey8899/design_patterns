package com.dewey.design_patterns.interpret;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author dewey
 * @date 2023/9/24 21:55
 * @function 功能描述
 * 终结者表达式-名词、代词
 */
public class TerminalExpression implements AbstractExpression{

    //定义集合存放允许的词
    private final List<String> list = new ArrayList<>();

    //创建对象时，需要给出允许的词
    public TerminalExpression(String[] arrStr) {
        list.addAll(Arrays.asList(arrStr));
    }

    @Override
    public boolean interpret(String info) {
        //包含这个词，返回true
        return list.contains(info);
    }
}
