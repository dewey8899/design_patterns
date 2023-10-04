package com.dewey.design_patterns.type.behavioral.observer.demo;

/**
 * @author dewey
 * @date 2023/10/4 14:54
 * @function 功能描述
 */

/**
 * 演示代码
 */
public class Main {

    public static void main(String[] args) {
        //粉丝1订阅
        MyObserver observer1 = new MyObserver("粉丝-dewey.du ", (key,message) -> {
            //这里进行消息处理
            System.out.println( key + "---------接收到消息:《" + message+"》");
        });
        //粉丝2订阅
        MyObserver observer2 = new MyObserver("粉丝-michelle.gong", (key,message) -> {
            //这里进行消息处理
            System.out.println( key + "---------接收到消息:《" + message+"》");
        });

        //加入观察者列表
        MyObservable myObservable = MyObservable.getInstance();
        myObservable.addObserver(observer1);
        myObservable.addObserver(observer2);

        //通知所有订阅的观察者
        myObservable.sendMessage("大家好，菲儿已开播了,赶快来我直播间吧！");
        myObservable.removeObserver(observer2);
        myObservable.sendMessage("大家好，雪儿已开播了,赶快来我直播间吧！");
    }
}
