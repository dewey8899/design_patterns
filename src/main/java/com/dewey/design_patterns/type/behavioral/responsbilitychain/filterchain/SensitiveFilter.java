package com.dewey.design_patterns.type.behavioral.responsbilitychain.filterchain;

/**
 * @auther dewey
 * @date 2022/6/5 22:00
 */
public class SensitiveFilter implements Filter{
    @Override
    public boolean doFilter(Msg msg) {
        String msg1 = msg.getMsg();
        msg1 = msg1.replace("996", "955");
        msg.setMsg(msg1);
        return true;
    }
}
