package com.dewey.design_patterns.type.concrete.abstractfactory;

/**
 * @author dewey
 * @date 2023/9/29 22:58
 * @function 功能描述
 */
public interface IDateBaseUtils {
    IConnection getConnection();

    ICommand getCommand();
}
