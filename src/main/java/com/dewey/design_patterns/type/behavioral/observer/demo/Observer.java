package com.dewey.design_patterns.type.behavioral.observer.demo;

/**
 * @author dewey
 * @date 2023/10/4 14:48
 * @function 功能描述
 * 观察者
 */
public interface Observer {
    /**
     * 观察者接收到 被观察者的状态变化时 收到信息
     * @param message  收到信息
     */
    void receiveMessage(String message);
}
