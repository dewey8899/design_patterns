package com.dewey.design_patterns.type.behavioral.state;

/**
 * @author dewey
 * @date 2023/10/6 21:52
 * @function 功能描述
 */
public class New extends ThreadState{
    public New(){
        stateName = "新建状态";
        System.out.println("线程创建.");
    }

    public void start(ThreadContext threadContext){
        System.out.println("调用线程启动方法start()");
        if("新建状态".equals(stateName)){
            //重新设置环境类中state状态变量的值
            threadContext.setState(new Runnable());
        } else {
            System.out.println("线程没有处于新建状态，不允许启动线程");
        }
    }
}
