package com.dewey.design_patterns.visitor.demo;

/**
 * @Author dewey.du
 * @Date 2023/9/26 9:26
 * @Project design_patterns
 **/
public abstract class User {
    /**
     * 姓名
     */
    private String name;
    /**
     * 身份
     */
    private String identity;
    /**
     * 班级
     */
    private String clazz;

    public User(String name, String identity, String clazz) {
        this.name = name;
        this.identity = identity;
        this.clazz = clazz;
    }

    /**
     * 接收访问者 访问
     * @param visitor 访问者
     */
    public abstract void accept(Visitor visitor);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
}
