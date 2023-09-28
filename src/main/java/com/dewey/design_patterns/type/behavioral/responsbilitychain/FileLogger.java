package com.dewey.design_patterns.type.behavioral.responsbilitychain;

/**
 * @auther dewey
 * @date 2022/9/28 23:09
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
