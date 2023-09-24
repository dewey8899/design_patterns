package com.dewey.design_patterns.memento;

import java.util.Stack;

/**
 * @author dewey
 * @date 2023/9/24 22:34
 * @function 功能描述
 * 管理者-记录着备份的对象
 */
public class Caretaker {
    //使用栈记录备份的记录，栈的特性：先进后出，符合还原操作
    private final Stack<Memento> stack = new Stack<>();

    //添加备份到栈
    public void push(Memento memento) {
        stack.push(memento);
    }

    //还原时，从栈中拿出备份的记录
    public Memento pop(){
        return stack.pop();
    }
}
