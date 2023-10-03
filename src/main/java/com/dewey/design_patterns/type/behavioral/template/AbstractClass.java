package com.dewey.design_patterns.type.behavioral.template;

/**
 * @author dewey
 * @date 2023/10/3 19:56
 * @function 功能描述
 */
public abstract class AbstractClass {
    public void operator(){
        System.out.println("one");
        System.out.println("two");
        templateMethod();
    }
    protected abstract void templateMethod();
}
