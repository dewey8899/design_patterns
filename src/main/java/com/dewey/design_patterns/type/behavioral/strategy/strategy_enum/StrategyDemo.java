package com.dewey.design_patterns.type.behavioral.strategy.strategy_enum;

/**
 * @Author dewey.du
 * @Date 2023/9/28 9:06
 * @Project design_patterns
 **/
public class StrategyDemo {
    public static void main(String[] args) {
        String monday = getToDo("Monday");
        System.out.println(monday);
    }

    //策略枚举判断
    public static String getToDo(String day) {
        CheckDay checkDay = new CheckDay();
        return checkDay.day(DayEnum.valueOf(day));
    }
}
