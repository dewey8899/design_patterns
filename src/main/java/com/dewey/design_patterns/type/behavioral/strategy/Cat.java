package com.dewey.design_patterns.type.behavioral.strategy;

/**
 * @auther dewey
 * @date 2022/5/20 9:28
 */
public class Cat implements Comparable<Cat> {

    private int height;

    public Cat(int height) {
        this.height = height;
    }
    @Override
    public int compareTo(Cat cat) {
        if (cat.height > this.height) {
            return -1;
        }
        if (cat.height < this.height) {
            return 1;
        }
        return 0;
    }

    public int getHeight() {
        return height;
    }
}
