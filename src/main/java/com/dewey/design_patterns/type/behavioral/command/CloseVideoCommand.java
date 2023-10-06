package com.dewey.design_patterns.type.behavioral.command;

/**
 * @author dewey
 * @date 2023/10/6 21:13
 * @function 功能描述
 */
public class CloseVideoCommand implements ICommand{
    private final CloseVideoReceiver closeVideoReceiver;

    public CloseVideoCommand(CloseVideoReceiver closeVideoReceiver) {
        this.closeVideoReceiver = closeVideoReceiver;
    }

    @Override
    public void execute() {
        System.out.println("按了关机的按钮");
        closeVideoReceiver.closeVideo();
    }
}
