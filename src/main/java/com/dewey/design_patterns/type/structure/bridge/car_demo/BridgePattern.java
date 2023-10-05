package com.dewey.design_patterns.type.structure.bridge.car_demo;

/**
 * @author dewey
 * @date 2023/10/5 23:11
 * @function 功能描述
 */
public class BridgePattern {
    public static void main(String[] args) {
        new AudiCar(new AutoEngine()).run();
        new AudiCar(new ManualEngine()).run();
        new BenzCar(new AutoEngine()).run();
        new BenzCar(new ManualEngine()).run();
        new BMWCar(new AutoEngine()).run();
        new BMWCar(new ManualEngine()).run();
    }
}
