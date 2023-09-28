package com.dewey.design_patterns.type.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dewey
 * @date 2023/9/25 23:14
 * @function 功能描述
 * 对象结构
 */
public class ObjectStructure {

    //存放有哪些元素可以访问
    List<Elements> list = new ArrayList<>();

    //添加元素到集合
    public void add(Elements elements){
        list.add(elements);
    }

    //接受访问-接受谁的方法，作为参数传递进来
    public void accept(Visitor visitor){
        for (Elements elements : list) {
            //让元素接受某个访问者的访问
            elements.accept(visitor);
        }

    }
}
