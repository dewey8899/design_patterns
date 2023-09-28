package com.dewey.design_patterns.type.behavioral.responsbilitychain;

/**
 * @auther dewey
 * @date 2022/9/28 23:08
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
