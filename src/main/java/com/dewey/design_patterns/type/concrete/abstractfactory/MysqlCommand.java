package com.dewey.design_patterns.type.concrete.abstractfactory;

/**
 * @author dewey
 * @date 2023/9/29 22:59
 * @function 功能描述
 */
public class MysqlCommand implements ICommand{
    @Override
    public void command() {
        System.out.println("mysql command");
    }
}
