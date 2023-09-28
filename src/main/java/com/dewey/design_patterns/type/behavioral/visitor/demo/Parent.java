package com.dewey.design_patterns.type.behavioral.visitor.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author dewey.du
 * @Date 2023/9/26 9:43
 * @Project design_patterns
 **/
@Slf4j
public class Parent implements Visitor {

    /**
     * 访问者 访问 学生类型
     *
     * @param student 学生类
     */
    @Override
    public void visitor(Student student) {
        log.info("学生姓名：{},班级：{}，排名：{}", student.getName(), student.getClazz(), student.ranking());
    }

    /**
     * 访问者 访问 老师类型
     *
     * @param teacher 老师
     */
    @Override
    public void visitor(Teacher teacher) {
        log.info("老师姓名：{}, 班级：{}", teacher.getName(), teacher.getClazz());

    }
}
