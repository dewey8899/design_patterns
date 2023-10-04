package com.dewey.design_patterns.type.behavioral.observer.simple_demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dewey
 * @date 2023/10/3 20:07
 * @function 功能描述
 */
public class Subject {
    private List<Observer> list = new ArrayList<>();

    public void add(Observer observer) {
        list.add(observer);
    }

    public void notifyAll(Object obj){
        for (int i = 0; i < list.size(); i++) {
            list.get(i).notify(obj);
        }
    }
}
interface Observer{
    void notify(Object object);
}
class SubClass1 implements Observer{

    @Override
    public void notify(Object object) {
        System.out.println("subclass1 收到通知 " + object);
    }
}
class SubClass2 implements Observer{

    @Override
    public void notify(Object object) {
        System.out.println("subclass2 收到通知 " + object);
    }
}