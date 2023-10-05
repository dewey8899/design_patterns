package com.dewey.design_patterns.type.structure.bridge;

/**
 * @author dewey
 * @date 2023/10/5 22:47
 * @function 功能描述
 */
public class BridgePattern {
    public static void main(String[] args) {
        new SubBehavior(new Cat()).wakeup();
        new SubBehavior(new Sheep()).wakeup();

        new SubBehavior2(new Cat()).wakeup();
        new SubBehavior2(new Sheep()).wakeup();

    }
}
