package com.dewey.design_patterns.type.structure.decorator;

/**
 * @Author dewey.du
 * @Date 2023/9/27 9:51
 * @Project design_patterns
 **/
public class DecoratorPattern {
    public static void main(String[] args) {
        Anything moon = new Moon(new Dream(new You(null)));
        moon.exe();
        Anything dream = new Dream(new Moon(new You(null)));
        dream.exe();

    }
}
