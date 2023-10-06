package com.dewey.design_patterns.type.behavioral.state;

/**
 * @author dewey
 * @date 2023/10/6 21:49
 * @function 功能描述
 */
public class StatePattern {
    public static void main(String[] args) {
        ThreadContext threadContext = new ThreadContext();
        //启动线程，方法执行前状态：新建，执行后状态：变为就绪
        threadContext.start();
        //获取到cpu资源，方法执行前状态：就绪，执行后状态：变为运行
        threadContext.getCpu();
        //中断线程，方法执行前状态：运行，执行后状态：变为阻塞
        threadContext.suspend();
        //恢复线程，方法执行前状态：阻塞，执行后状态：变为就绪
        threadContext.resume();
        //获取到cpu资源，方法执行前状态：就绪，执行后状态：变为运行
        threadContext.getCpu();
        //停止线程 ，方法执行前状态：运行，执行后状态：变为停止
        threadContext.stop();
    }
}
