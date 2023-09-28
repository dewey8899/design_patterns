package com.dewey.design_patterns.type.behavioral.strategy;

/**
 * @auther dewey
 * @date 2022/5/20 7:57
 */
public class StrategyV1 {


    public static void main(String[] args) {
        Cat cat1 = new Cat(5);
        Cat cat2 = new Cat( 1);
        Cat cat3 = new Cat( 3);
        Cat[] cats = {cat1, cat2, cat3};
        Sorter sorter = new Sorter();
        sorter.sort(cats, (o1, o2) -> 0);
    }
}
