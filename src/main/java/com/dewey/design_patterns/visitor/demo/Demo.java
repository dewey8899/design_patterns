package com.dewey.design_patterns.visitor.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author dewey.du
 * @Date 2023/9/26 10:10
 * @Project design_patterns
 **/
@Slf4j
public class Demo {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.dataView();
        log.info("家长视角：");
        objectStructure.show(new Parent());
        log.info("校长视角：");
        objectStructure.show(new Principle());
//        objectStructure.show(new Parent());
    }

}
