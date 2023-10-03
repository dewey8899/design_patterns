package com.dewey.design_patterns.type.concrete.abstractfactory;

/**
 * @author dewey
 * @date 2023/9/29 23:01
 * @function 功能描述
 */
public class OracleDateBaseUtils implements IDateBaseUtils{
    @Override
    public IConnection getConnection() {
        return new OracleConnection();
    }

    @Override
    public ICommand getCommand() {
        return new OracleCommand();
    }
}
