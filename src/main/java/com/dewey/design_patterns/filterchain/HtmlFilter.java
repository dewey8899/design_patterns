package com.dewey.design_patterns.filterchain;

/**
 * @auther dewey
 * @date 2022/6/5 22:00
 */
public class HtmlFilter implements Filter{
    @Override
    public boolean doFilter(Msg msg) {
        String msg1 = msg.getMsg();
        String replaceS = msg1.replace('<', '[');
        replaceS = replaceS.replace('>', ']');
        msg.setMsg(replaceS);
        return true;
    }
}
