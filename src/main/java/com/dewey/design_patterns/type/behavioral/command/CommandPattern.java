package com.dewey.design_patterns.type.behavioral.command;

/**
 * @author dewey
 * @date 2023/10/6 21:16
 * @function 功能描述
 */
public class CommandPattern {
    public static void main(String[] args) {
        ICommand closeVideoCommand = new CloseVideoCommand(new CloseVideoReceiver());
        ICommand upVideoCommand = new UpVideoCommand(new UpVideoReceiver());
        ControllerInvoker invoker = new ControllerInvoker();
        invoker.setCloseVideoCommand(closeVideoCommand);
        invoker.setUpVideoCommand(upVideoCommand);
        invoker.closeVideo();
        invoker.upVideo();
    }
}
