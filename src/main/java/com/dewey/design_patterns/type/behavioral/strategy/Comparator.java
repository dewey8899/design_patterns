package com.dewey.design_patterns.type.behavioral.strategy;

/**
 * @auther dewey
 * @date 2022/5/20 9:39
 * 比较策略
 */
public interface Comparator<T>{
    int compare(T o1, T o2);
}
