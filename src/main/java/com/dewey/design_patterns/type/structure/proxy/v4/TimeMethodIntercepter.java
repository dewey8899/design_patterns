package com.dewey.design_patterns.type.structure.proxy.v4;

import net.sf.cglib.proxy.Callback;

/**
 * @auther dewey
 * @date 2022/6/18 21:15
 */
public class TimeMethodIntercepter implements Callback {
    public static void main(String[] args) {
        Integer a = 10;
        String b = Integer.toString(a);
        System.out.println(b);
    }
}
