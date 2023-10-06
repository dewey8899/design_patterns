package com.dewey.design_patterns.type.behavioral.responsbilitychain.filterchain;

/**
 * @auther dewey
 * @date 2022/6/5 21:47
 */
public interface Filter {

    boolean doFilter(Msg msg);
}
