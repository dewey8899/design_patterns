package com.dewey.design_patterns.type.behavioral.state;

/**
 * @author dewey
 * @date 2023/10/6 21:54
 * @function 功能描述
 */
public class Blocked extends ThreadState{
    public Blocked() {
        stateName = "阻塞状态";
        System.out.println("线程处于阻塞状态");
    }

    public void resume(ThreadContext threadContext){
        System.out.println("调用线程恢复方法resume()");
        if("阻塞状态".equals(stateName)){
            //重新设置环境类中state状态变量的值
            threadContext.setState(new Runnable());
        } else {
            System.out.println("线程没有处于阻塞状态，不允许恢复");
        }
    }

}
