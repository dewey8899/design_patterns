package com.dewey.design_patterns.memento;

/**
 * @author dewey
 * @date 2023/9/24 22:35
 * @function 功能描述
 *          发起人角色
 */
public class Originator {
    private String state;

    //创建备份录
    public Memento createMemento(){
        //把需要备份的字段都传递到备份类实体中进行备份
        return new Memento(state);
    }

    //恢复备份-通过某个备份文件还原当前发起人的数据
    public void restoreMemento(Memento memento){
        //把备份类记录的值还原到发起人类对应的字段中
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
