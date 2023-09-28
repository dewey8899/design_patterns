package com.dewey.design_patterns.type.behavioral.filterchain;

/**
 * @auther dewey
 * @date 2022-6-5 22:23:48
 */
public class UrlFilter implements Filter{
    @Override
    public boolean doFilter(Msg msg) {
        String msg1 = msg.getMsg();
        String replaceS = msg1.replace("www.dewey.com", "http://www.dewey.com");
        msg.setMsg(replaceS);
        return true;
    }
}
