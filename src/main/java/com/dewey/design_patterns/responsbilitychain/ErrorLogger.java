package com.dewey.design_patterns.responsbilitychain;

/**
 * @auther dewey
 * @date 2022/9/28 23:09
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
