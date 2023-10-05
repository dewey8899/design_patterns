package com.dewey.design_patterns.type.structure.bridge.car_demo;

/**
 * @author dewey
 * @date 2023/10/5 23:07
 * @function 功能描述
 */
public class AutoEngine extends AbstractEngine{
    @Override
    public String engine() {
        return "自动挡引擎";
    }
}
