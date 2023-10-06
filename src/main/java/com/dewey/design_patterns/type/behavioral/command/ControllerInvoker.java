package com.dewey.design_patterns.type.behavioral.command;

/**
 * @author dewey
 * @date 2023/10/6 21:17
 * @function 功能描述
 */
public class ControllerInvoker {
    private ICommand upVideoCommand,closeVideoCommand;


    public void setUpVideoCommand(ICommand upVideoCommand) {
        this.upVideoCommand = upVideoCommand;
    }

    public void setCloseVideoCommand(ICommand closeVideoCommand) {
        this.closeVideoCommand = closeVideoCommand;
    }

    public void upVideo(){
        upVideoCommand.execute();
    }
    public void closeVideo(){
        closeVideoCommand.execute();
    }
}
