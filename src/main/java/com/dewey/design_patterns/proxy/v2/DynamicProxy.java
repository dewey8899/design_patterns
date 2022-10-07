package com.dewey.design_patterns.proxy.v2;

import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * @auther dewey
 * @date 2022/6/18 18:50
 */
public class DynamicProxy implements Movable{

    @Override
    public int move() throws InterruptedException {
        System.out.println("MyProxy moving ka ka ka ka ka.....");
        Thread.sleep(new Random().nextInt(10000));
        return 2;
    }

    public static void main(String[] args) throws InterruptedException {
        DynamicProxy dynamicProxy = new DynamicProxy();
        Movable movable = (Movable) Proxy.newProxyInstance(DynamicProxy.class.getClassLoader(),
                new Class[]{Movable.class},
                (proxy, method, args1) -> {
                    System.out.println("method " + method.getName() + " starting...");
                    Object o = method.invoke(dynamicProxy, args1);
                    System.out.println("method " + method.getName() + " end");
                    return o;
                });
        movable.move();
    }
}

interface Movable{
    int move() throws InterruptedException;
}