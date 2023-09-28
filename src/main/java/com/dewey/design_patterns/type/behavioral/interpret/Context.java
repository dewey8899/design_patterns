package com.dewey.design_patterns.type.behavioral.interpret;

/**
 * @author dewey
 * @date 2023/9/24 21:58
 * @function 功能描述
 * 环境角色
 */
public class Context {
    //定义允许的此
    String[] jobArr = {"军人","警察"};
    String[] persionArr = {"父母","子女"};

    //定义一个非终结表达式对象
    AbstractExpression nonTerminalExpression;

    public Context() {
        //创建终结者表达式对象
        TerminalExpression jobExpression = new TerminalExpression(jobArr);
        TerminalExpression terminalExpression = new TerminalExpression(persionArr);
        nonTerminalExpression = new NonTerminalExpression(jobExpression, terminalExpression);
    }

    /**
     * 输入一个字符判断是否符合表达式
     * @param info 字符信息
     */
    public void checkMes(String info){
        boolean interpret = nonTerminalExpression.interpret(info);
        if(interpret){
            System.out.println(info+"可以享受优先的政策");
        } else {
            System.out.println(info+"正常排队");
        }
    }
}
