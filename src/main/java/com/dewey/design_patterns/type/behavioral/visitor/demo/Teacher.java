package com.dewey.design_patterns.type.behavioral.visitor.demo;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Author dewey.du
 * @Date 2023/9/26 9:31
 * @Project design_patterns
 **/
@Slf4j
public class Teacher extends User{
    public Teacher(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }

    /**
     * 升学率
     * @return
     */
    public double entranceRatio() {
        return BigDecimal.valueOf(Math.random() * 100).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
