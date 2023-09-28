package com.dewey.design_patterns.type.behavioral.strategy;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dewey
 * @date 2022/5/20 9:24
 */
public class Sorter<T> {
    public void sort(T[] arr, Comparator<T> comparator) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = comparator.compare(arr[i], arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    private void swap(T[] arr, int i, int minPos) {
        T tmp = arr[i];
        arr[i] = arr[minPos];
        arr[minPos] = tmp;
    }

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("100");
        BigDecimal b = new BigDecimal("200");
        BigDecimal subtract = a.subtract(b);
        System.out.println(subtract);
        System.out.println(BigDecimal.ZERO.compareTo(subtract));
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        getList(list);
        List<BigDecimalA> lb = new ArrayList<>();
        BigDecimal amount = new BigDecimal("0.1");
        lb.add(new BigDecimalA("0.1", amount));
        lb.add(new BigDecimalA("0.1", amount));
        lb.add(new BigDecimalA("0.12", amount));
        final BigDecimal[] bigDecimal = {new BigDecimal("0.0")};
        lb.forEach(l -> {
            bigDecimal[0] = bigDecimal[0].add(l.getAmount());
        });
        System.out.println(bigDecimal[0]);
    }

    public static void getList(List<String> list) {
        List<String> list2 = list;
        list2.remove(0);
        list2.remove(0);
        list = list2;
    }
}

class BigDecimalA {
    public BigDecimalA(String name, BigDecimal amount) {
        this.name = name;
        this.amount = amount;
    }

    private String name;
    private BigDecimal amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
