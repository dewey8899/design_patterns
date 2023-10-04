package com.dewey.design_patterns.type.behavioral.observer.demo;

/**
 * @author dewey
 * @date 2023/10/4 14:51
 * @function 功能描述
 */
public interface Observable {
    /**
     * 添加 观察者
     * @param observer 观察者
     */
    void addObserver(Observer observer);
    /**
     * 移除 观察者
     * @param observer 观察者
     */
    void removeObserver(Observer observer);

    /**
     *  发送消息
     * @param message 消息内容
     */
    void sendMessage(String message);
}
