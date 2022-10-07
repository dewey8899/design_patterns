package com.dewey.design_patterns.filterchain2;

/**
 * @auther dewey
 * @date 2022-6-5 22:23:48
 */
public class FaceFilter implements Filter {
    @Override
    public void doFilter(Request request,Response response,FilterChain chain) {
        String msg = request.getMsg();
        String replaceS = msg.replace("):", "^v^");
        request.setMsg(replaceS);
        chain.doFilter(request,response);
        response.setMsg(response.getMsg()+" response");
    }
}
