package com.dewey.design_patterns.memento;

import java.util.Stack;

/**
 * @author dewey
 * @date 2023/9/24 22:31
 * @function 功能描述
 */
public class MementoTest {
    public static void main(String[] args) {
        //创建管理者
        Caretaker caretaker = new Caretaker();
        //创建发起者
        Originator originator = new Originator();
        originator.setState("0");
        //创建备份
        Memento memento = originator.createMemento();
        //备份添加到管理者中
        caretaker.push(memento);
        originator.setState("1");
        //备份添加到管理者中
        caretaker.push(originator.createMemento());
        originator.setState("2");
        System.out.println("当前状态值:"+originator.getState());
        //第一次还原
        originator.restoreMemento(caretaker.pop());
        System.out.println("第一次还原状态值:"+originator.getState());
        //第二次还原
        originator.restoreMemento(caretaker.pop());
        System.out.println("第二次还原状态值:"+originator.getState());
    }
}
