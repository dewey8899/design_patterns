package com.dewey.design_patterns.type.behavioral.state;

/**
 * @author dewey
 * @date 2023/10/6 21:54
 * @function 功能描述
 */
public class Runnable extends ThreadState{
    public Runnable() {
        stateName = "就绪状态";
        System.out.println("线程处于就绪状态");
    }

    public void getCpu(ThreadContext threadContext){
        System.out.println("调用线程获取资源方法getCpu()");
        if("就绪状态".equals(stateName)){
            //重新设置环境类中state状态变量的值
            threadContext.setState(new Running());
        } else {
            System.out.println("线程没有处于就绪状态，不允许获取资源");
        }
    }

}
