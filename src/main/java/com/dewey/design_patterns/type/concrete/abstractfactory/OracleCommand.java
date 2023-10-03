package com.dewey.design_patterns.type.concrete.abstractfactory;

/**
 * @author dewey
 * @date 2023/9/29 22:59
 * @function 功能描述
 */
public class OracleCommand implements ICommand{

    @Override
    public void command() {
        System.out.println("oracle command");
    }
}
