package com.dewey.design_patterns.type.behavioral.responsbilitychain.filterchain2;

/**
 * @auther dewey
 * @date 2022/6/5 22:00
 */
public class HtmlFilter implements Filter {
    @Override
    public void doFilter(Request request,Response response,FilterChain chain) {
        String msg1 = request.getMsg();
        String replaceS = msg1.replace('<', '[');
        replaceS = replaceS.replace('>', ']');
        request.setMsg(replaceS);
        chain.doFilter(request,response);
        response.setMsg(response.getMsg()+" htmlResponse");
    }
}
