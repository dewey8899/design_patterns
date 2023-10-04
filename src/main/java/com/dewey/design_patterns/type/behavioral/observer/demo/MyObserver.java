package com.dewey.design_patterns.type.behavioral.observer.demo;

/**
 * @author dewey
 * @date 2023/10/4 14:53
 * @function 功能描述
 * 观察者实现类
 */
public class MyObserver implements Observer{
    private String key;
    private final ObserverListener mObserverListener;

    public MyObserver(String key, ObserverListener observerListener) {
        this.key = key;
        this.mObserverListener = observerListener;
    }

    @Override
    public void receiveMessage(String message) {
        if (mObserverListener != null) {
            mObserverListener.receive(key,message);
        }
    }

    public interface ObserverListener {
        void receive(String key,String message);
    }
}
