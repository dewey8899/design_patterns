package com.dewey.design_patterns.type.structure.bridge.car_demo;

/**
 * @author dewey
 * @date 2023/10/5 23:08
 * @function 功能描述
 */
public class ManualEngine extends AbstractEngine{
    @Override
    public String engine() {
        return "手动挡引擎";
    }
}
