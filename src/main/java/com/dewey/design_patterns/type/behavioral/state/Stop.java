package com.dewey.design_patterns.type.behavioral.state;

/**
 * @author dewey
 * @date 2023/10/6 21:54
 * @function 功能描述
 */
public class Stop extends ThreadState{
    public Stop() {
        stateName = "结束状态";
        System.out.println("线程处于结束状态");

    }

}
