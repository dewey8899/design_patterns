package com.dewey.design_patterns.type.structure.proxy.v3;

import java.lang.reflect.Proxy;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Random;

/**
 * @auther dewey
 * @date 2022/6/18 19:44
 */
public class ProxyV3 implements Movable{

    @Override
    public void move() throws InterruptedException {
        System.out.println("ProxyV3 moving ka ka ka ka ka.....");
        Thread.sleep(new Random().nextInt(10000));
    }

    public static void main(String[] args) throws InterruptedException {
        ProxyV3 dynamicProxy = new ProxyV3();
        Properties properties = System.getProperties();
        Enumeration<?> enumeration = properties.propertyNames();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
        System.out.println(properties.getProperty("jdk.proxy.ProxyGenerator.saveGeneratedFiles"));
        properties.put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");
        System.out.println(properties.getProperty("jdk.proxy.ProxyGenerator.saveGeneratedFiles"));
        Movable movable = (Movable) Proxy.newProxyInstance(ProxyV3.class.getClassLoader(),
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
    void move() throws InterruptedException;
}
