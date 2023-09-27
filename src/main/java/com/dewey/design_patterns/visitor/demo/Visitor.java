package com.dewey.design_patterns.visitor.demo;

/**
 * @Author dewey.du
 * @Date 2023/9/26 9:25
 * @Project design_patterns
 **/
public interface Visitor {
    /**
     * 访问者 访问 学生或者老师类型
     * @param student 学生类
     */
    void visitor(Student student);

    /**
     * 访问者 访问 老师类型
     * @param teacher 老师
     */
    void visitor(Teacher teacher);
}
