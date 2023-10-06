package com.dewey.design_patterns.type.behavioral.responsbilitychain.filterchain2;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther dewey
 * @date 2022/6/5 22:04
 */
public class FilterChain {
    List<Filter> filters = new ArrayList<>();
    int index = 0;

    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }

    public void doFilter(Request request, Response response) {
        if (index == filters.size()) return;
        Filter filter = filters.get(index);
        index++;
        filter.doFilter(request, response, this);
    }
}
