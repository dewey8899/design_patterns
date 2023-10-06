package com.dewey.design_patterns.type.behavioral.state;

/**
 * @author dewey
 * @date 2023/10/6 21:54
 * @function 功能描述
 */
public class Running extends ThreadState{
    public Running() {
        stateName = "运行状态";
        System.out.println("线程处于运行状态");
    }

    public void suspend(ThreadContext threadContext){
        System.out.println("调用线程中断方法suspend()");
        if("运行状态".equals(stateName)){
            //重新设置环境类中state状态变量的值
            threadContext.setState(new Blocked());
        } else {
            System.out.println("线程没有处于运行状态，不允许中断");
        }
    }

    public void stop(ThreadContext threadContext){
        System.out.println("调用线程结束方法stop()");
        if("运行状态".equals(stateName)){
            //重新设置环境类中state状态变量的值
            threadContext.setState(new Stop());
        } else {
            System.out.println("线程没有处于运行状态，不允许结束");
        }
    }

}
