package com.dewey.design_patterns.type.behavioral.interpret;

/**
 * @author dewey
 * @date 2023/9/24 21:56
 * @function 功能描述
 * 非终结者表达式-谓语（动词）
 */
public class NonTerminalExpression implements AbstractExpression{
    //记录终结者表达式的对象
    private final AbstractExpression jobExpression;
    private final AbstractExpression persionExpression;

    public NonTerminalExpression(AbstractExpression jobExpression, AbstractExpression persionExpression) {
        this.jobExpression = jobExpression;
        this.persionExpression = persionExpression;
    }

    @Override
    public boolean interpret(String info) {
        //非终结者进行分词
        String[]  arr = info.split("的");
        //判断是否包含
        return jobExpression.interpret(arr[0]) && persionExpression.interpret(arr[1]);
    }
}
