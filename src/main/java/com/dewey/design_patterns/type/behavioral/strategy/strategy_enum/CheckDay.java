package com.dewey.design_patterns.type.behavioral.strategy.strategy_enum;

/**
 * @Author dewey.du
 * @Date 2023/9/28 9:08
 * @Project design_patterns
 **/
public class CheckDay {
    public String day( DayEnum dayEnum) {
        return dayEnum.toDo();
    }
}