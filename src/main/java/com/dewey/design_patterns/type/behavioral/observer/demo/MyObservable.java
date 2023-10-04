package com.dewey.design_patterns.type.behavioral.observer.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dewey
 * @date 2023/10/4 14:52
 * @function 功能描述
 * 被观察者 (实现类)
 */
public class MyObservable implements Observable{
    //单例 就一个被观察者 实例
    private static volatile MyObservable instance = null;
    private MyObservable() {
    }
    //生成单例的方法
    public static MyObservable getInstance() {
        if (instance == null) {
            synchronized (MyObserver.class) {
                if (instance == null) {
                    instance = new MyObservable();
                }
            }
        }
        return instance;
    }

    /**
     * 通知所有观察着
     *
     * @param message 消息实体内容
     */
    private void notifyObserver(String message) {
        for (Observer observer : mObservers) {
            observer.receiveMessage(message);
        }
    }


    //维护的观察者列表
    private final List<Observer> mObservers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        mObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        mObservers.remove(observer);
    }

    @Override
    public void sendMessage(String message) {
        notifyObserver(message);
    }
}
