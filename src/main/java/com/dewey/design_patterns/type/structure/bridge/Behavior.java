package com.dewey.design_patterns.type.structure.bridge;

/**
 * @author dewey
 * @date 2023/10/5 22:44
 * @function 功能描述
 */
public abstract class Behavior {
    Animal animal;

    public Behavior(Animal animal) {
        this.animal = animal;
    }

    public abstract void wakeup();
}
