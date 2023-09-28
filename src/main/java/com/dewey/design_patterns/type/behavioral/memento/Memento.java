package com.dewey.design_patterns.type.behavioral.memento;

/**
 * @author dewey
 * @date 2023/9/24 22:36
 * @function 功能描述
 *          备忘录实体-需要记录发起人存放的所有字符值
 */
public class Memento {
    //字段，与发起人实体中相同的字段
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
