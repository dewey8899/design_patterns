package com.dewey.design_patterns.type.structure.bridge.car_demo;

/**
 * @author dewey
 * @date 2023/10/5 23:09
 * @function 功能描述
 */
public class BMWCar extends AbstractCar{
    public BMWCar(AbstractEngine abstractEngine) {
        super(abstractEngine);
    }

    @Override
    public void run() {
        System.out.println(abstractEngine.engine() + "宝马车跑起来");
    }
}
