package com.dewey.design_patterns.type.behavioral.observer.simple_demo2;

/**
 * @author dewey
 * @date 2023/10/3 20:04
 * @function 功能描述
 */
public class ObserverPattern {

    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.add(new SubClass1());
        subject.add(new SubClass2());
        subject.notifyAll("数据库有更新");
    }
}
