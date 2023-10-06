package com.dewey.design_patterns.type.behavioral.responsbilitychain.filterchain2;

/**
 * @auther dewey
 * @date 2022/6/5 21:47
 */
public interface Filter {

    void doFilter(Request request,Response response,FilterChain chain);
}
