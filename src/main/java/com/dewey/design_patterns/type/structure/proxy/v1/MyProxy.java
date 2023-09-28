package com.dewey.design_patterns.type.structure.proxy.v1;

import java.util.Random;

/**
 * @auther dewey
 * @date 2022/6/18 17:46
 * 静态代理
 */
public class MyProxy implements Movable{

    @Override
    public void move() throws InterruptedException {
        System.out.println("MyProxy moving kakakakak.....");
        Thread.sleep(new Random().nextInt(10000));
    }


    public static void main(String[] args) throws InterruptedException {
        new TankTimeProxy(new TankLogProxy(new MyProxy())).move();
    }
}
class TankTimeProxy implements Movable{
    Movable m;
    public TankTimeProxy(Movable m){
        this.m = m;
    }
    @Override
    public void move() throws InterruptedException {
        System.out.println("time  start......");
        long startTime = System.currentTimeMillis();
        m.move();
        long endTime = System.currentTimeMillis();
        System.out.println("time  end....spend time "+ (endTime - startTime) + " ms");
    }
}
class TankLogProxy implements Movable{
    Movable m;
    public TankLogProxy(Movable m){
        this.m = m;
    }
    @Override
    public void move() throws InterruptedException {
        System.out.println("log start ......");
        m.move();
        System.out.println("log end ......");
    }
}
interface Movable{
    void move() throws InterruptedException;
}