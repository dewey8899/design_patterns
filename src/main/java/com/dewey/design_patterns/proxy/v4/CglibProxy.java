package com.dewey.design_patterns.proxy.v4;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Random;

/**
 * @auther dewey
 * @date 2022/6/18 20:42
 */
public class CglibProxy {
    public static void main(String[] args) throws InterruptedException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Tank.class);
        enhancer.setCallback(new TimeMethodInterceptor());
        Tank tank = (Tank) enhancer.create();
        tank.move();
    }


}
class TimeMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("after");
        return result;
    }
}
class Tank{
    public void move() throws InterruptedException {
        System.out.println("tank moving ...");
        Thread.sleep(new Random().nextInt(1000));
    }
}
