package com.dewey.design_patterns.type.structure.composite.file_demo;

/**
 * @author dewey
 * @date 2023/10/5 18:12
 * @function 功能描述
 */
public abstract class FileComponent {
    /**
     * 文件或者文件夹的名称
     */
    protected String name;
    /**
     * 层级
     */
    protected Integer level;
    /**
     * 文件夹、文件
     */
    protected Integer type;

    public abstract void add(FileComponent component);

    public abstract void remove(FileComponent component);

    public abstract FileComponent getChild(int index);

    abstract void print();
}
