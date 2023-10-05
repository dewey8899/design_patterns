package com.dewey.design_patterns.type.structure.bridge.car_demo;

/**
 * @author dewey
 * @date 2023/10/5 23:09
 * @function 功能描述
 */
public class AudiCar extends AbstractCar{
    public AudiCar(AbstractEngine abstractEngine) {
        super(abstractEngine);
    }

    @Override
    public void run() {
        System.out.println(abstractEngine.engine() + "奥迪车跑起来");
    }
}
