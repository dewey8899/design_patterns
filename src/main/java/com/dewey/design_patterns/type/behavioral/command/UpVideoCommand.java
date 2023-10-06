package com.dewey.design_patterns.type.behavioral.command;

/**
 * @author dewey
 * @date 2023/10/6 21:13
 * @function 功能描述
 */
public class UpVideoCommand implements ICommand{
    private final UpVideoReceiver upVideoReceiver;

    public UpVideoCommand(UpVideoReceiver upVideoReceiver) {
        this.upVideoReceiver = upVideoReceiver;
    }

    @Override
    public void execute() {
        System.out.println("按了调节上一个节目的按钮");
        upVideoReceiver.upVideo();
    }
}
