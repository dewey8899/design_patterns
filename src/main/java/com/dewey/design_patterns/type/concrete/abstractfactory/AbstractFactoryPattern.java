package com.dewey.design_patterns.type.concrete.abstractfactory;

/**
 * @author dewey
 * @date 2023/9/29 22:55
 * @function 功能描述
 */
public class AbstractFactoryPattern {
    public static void main(String[] args) {
        IDateBaseUtils dateBaseUtils = new MysqlDateBaseUtils();
        dateBaseUtils.getCommand().command();
        dateBaseUtils.getConnection().connection();
        dateBaseUtils = new OracleDateBaseUtils();
        dateBaseUtils.getCommand().command();
        dateBaseUtils.getConnection().connection();
    }
}
