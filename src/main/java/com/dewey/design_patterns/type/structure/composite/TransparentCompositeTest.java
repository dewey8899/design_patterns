package com.dewey.design_patterns.type.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dewey
 * @date 2023/10/4 21:56
 * @function 功能描述
 */
public class TransparentCompositeTest {
    public static void main(String[] args) {
        Component composite0 = new Composite();
        Component composite1 = new Composite();
        Component left1 = new Leaf("1");
        Component left2 = new Leaf("2");
        Component left3 = new Leaf("3");
        composite0.add(left1);
        composite0.add(composite1);
        composite1.add(left2);
        composite1.add(left3);
        composite0.operate();
    }
}

//抽象构件-定义子类需要的所有方法
interface Component{
    void add(Component component);
    void remove(Component component);
    Component getChild(int index);
    void operate();
}

//树叶构件-没有添加、删除、获取子类的方法实现
class Leaf implements Component{

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public Component getChild(int index) {
        return null;
    }

    @Override
    public void operate() {
        System.out.println("叶子："+name+"被访问");
    }
}

//树枝构件-包含它下面的子类集合
class Composite implements Component{

    private final List<Component> childList = new ArrayList<>();

    @Override
    public void add(Component component) {
        childList.add(component);
    }

    @Override
    public void remove(Component component) {
        childList.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return childList.get(index);
    }

    @Override
    public void operate() {
        for(Component component : childList){
            component.operate();
        }
    }
}
