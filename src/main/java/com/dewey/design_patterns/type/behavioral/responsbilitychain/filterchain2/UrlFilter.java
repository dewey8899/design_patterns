package com.dewey.design_patterns.type.behavioral.responsbilitychain.filterchain2;

/**
 * @auther dewey
 * @date 2022-6-5 22:23:48
 */
public class UrlFilter implements Filter {
    @Override
    public void doFilter(Request request,Response response,FilterChain chain) {
        String msg1 = request.getMsg();
        String replaceS = msg1.replace("www.dewey.com", "http://www.dewey.com");
        request.setMsg(replaceS);
        chain.doFilter(request,response);
        response.setMsg(response.getMsg()+" response");
    }
}
