package com.dewey.design_patterns.filterchain;

/**
 * @auther dewey
 * @date 2022/6/5 22:16
 */
public class Msg {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
