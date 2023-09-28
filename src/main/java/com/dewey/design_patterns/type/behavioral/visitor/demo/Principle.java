package com.dewey.design_patterns.type.behavioral.visitor.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author dewey.du
 * @Date 2023/9/26 11:09
 * @Project design_patterns
 **/
@Slf4j
public class Principle implements Visitor{
    /**
     * 访问者 访问 学生或者老师类型
     *
     * @param student 学生类
     */
    @Override
    public void visitor(Student student) {
        log.info("学生信息 姓名： {} 班级：{}", student.getName(), student.getClazz());
    }

    /**
     * 访问者 访问 老师类型
     *
     * @param teacher 老师
     */
    @Override
    public void visitor(Teacher teacher) {
        log.info("老师信息 姓名：{} ，班级：{}，升学率：{}", teacher.getName(), teacher.getClazz(), teacher.entranceRatio());

    }
}
