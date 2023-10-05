package com.dewey.design_patterns.type.structure.bridge;

/**
 * @author dewey
 * @date 2023/10/5 22:45
 * @function 功能描述
 */
public class SubBehavior2 extends Behavior{
    public SubBehavior2(Animal animal) {
        super(animal);
    }

    @Override
    public void wakeup() {
        animal.operation();
        System.out.println("扩展实例2调用：");
    }
}
