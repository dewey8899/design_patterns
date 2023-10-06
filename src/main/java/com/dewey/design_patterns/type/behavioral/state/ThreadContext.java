package com.dewey.design_patterns.type.behavioral.state;

/**
 * @author dewey
 * @date 2023/10/6 21:51
 * @function 功能描述
 */
public class ThreadContext {
    private ThreadState state;

    public ThreadContext() {
        state = new New();
    }

    public ThreadState getState() {
        return state;
    }

    public void setState(ThreadState state) {
        this.state = state;
    }


    //调用启动方法-状态为新建的时候
    public void start(){
        //把state抽象类强转成具体的子类，调用子类的方法，并把环境类传递过去，这样可以在此方法调用后改变state状态值
        ((New)state).start(this);
    }

    //调用获取cpu资源-状态为就绪的时候
    public void getCpu(){
        //把state抽象类强转成具体的子类，调用子类的方法，并把环境类传递过去，这样可以在此方法调用后改变state状态值
        ((Runnable)state).getCpu(this);
    }

    //调用线程中断-状态为运行的时候
    public void suspend(){
        //把state抽象类强转成具体的子类，调用子类的方法，并把环境类传递过去，这样可以在此方法调用后改变state状态值
        ((Running)state).suspend(this);
    }

    //调用线程结束-状态为运行的时候
    public void stop(){
        //把state抽象类强转成具体的子类，调用子类的方法，并把环境类传递过去，这样可以在此方法调用后改变state状态值
        ((Running)state).stop(this);
    }

    //调用线程结束-状态为阻塞的时候
    public void resume(){
        //把state抽象类强转成具体的子类，调用子类的方法，并把环境类传递过去，这样可以在此方法调用后改变state状态值
        ((Blocked)state).resume(this);
    }
}
