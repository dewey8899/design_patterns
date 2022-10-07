package com.dewey.design_patterns.filterchain2;

/**
 * @auther dewey
 * @date 2022/6/5 22:00
 */
public class SensitiveFilter implements Filter {
    @Override
    public void doFilter(Request request,Response response,FilterChain chain) {
        String msg1 = request.getMsg();
        msg1 = msg1.replace("996", "955");
        request.setMsg(msg1);
        chain.doFilter(request,response);
        response.setMsg(response.getMsg()+" sensitiveResponse");
    }
}
