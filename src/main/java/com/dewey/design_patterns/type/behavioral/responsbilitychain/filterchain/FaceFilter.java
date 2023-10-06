package com.dewey.design_patterns.type.behavioral.responsbilitychain.filterchain;

/**
 * @auther dewey
 * @date 2022-6-5 22:23:48
 */
public class FaceFilter implements Filter{
    @Override
    public boolean doFilter(Msg msg) {
        String msg1 = msg.getMsg();
        String replaceS = msg1.replace("):", "^v^");
        msg.setMsg(replaceS);
        return true;
    }
}
