package com.dewey.design_patterns.type.behavioral.memento;


/**
 * @author dewey
 * @date 2023/9/24 22:31
 * @function 功能描述
 * 备忘录模式Memento在不破坏封装性的前提下，捕获一个对象的内部状态，并在改对象之外保存这个状态，以便以后当需要时能将该对象恢复到原先保存的状态，该模式又叫快照模式。
 * 应用场景：
 * 1.需要保存与恢复数据的场景，如玩游戏时的中间结果存档功能；
 * 2.需要提供一个可回滚操作的场景，如Word、记事本、Photoshop、Eclipse等软件在编辑时按Ctrl+Z组合键，还有数据库中事务操作。
 * 优点：
 * 1.提供了一种可以恢复状态的机制，当用户需要时能够比较方便的将数据恢复到某个历史状态；
 * 2.实现了内部状态的封装，除了创建它的发起人之外，其它对象都不能够访问这些状态信息；
 * 3.简化了发起人类，发起人不需要管理和保存其内部状态的各个备份，所有状态信息都保存在备忘录中，并由管理者进行管理，这符合单一职责原则。
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
