package com.dewey.design_patterns.type.structure.bridge;

/**
 * @author dewey
 * @date 2023/10/5 22:43
 * @function 功能描述
 */
public class Sheep implements Animal{
    @Override
    public void operation() {
        System.out.print("绵羊 ");
    }
}
