package com.dewey.design_patterns.filterchain;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther dewey
 * @date 2022/6/5 22:04
 */
public class FilterChain implements Filter{
    List<Filter> filters = new ArrayList<>();
    public FilterChain add(Filter filter){
        filters.add(filter);
        return this;
    }

    @Override
    public boolean doFilter(Msg msg) {
        for (Filter filter : filters) {
            if (!filter.doFilter(msg)){
                return false;
            }
        }
        return true;
    }
}
