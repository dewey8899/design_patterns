package com.dewey.design_patterns.type.structure.composite.file_demo;

/**
 * @author dewey
 * @date 2023/10/5 18:24
 * @function 功能描述
 */
public class File extends FileComponent{

    public File(String name, Integer level, Integer type) {
        this.name = name;
        this.level = level;
        this.type = type;
    }

    @Override
    public void add(FileComponent component) {

    }

    @Override
    public void remove(FileComponent component) {

    }

    @Override
    public FileComponent getChild(int index) {
        return null;
    }

    @Override
    void print() {
        for (int i = 0; i < level; i++) {
            System.out.printf("-- ");
        }
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", type=" + type +
                '}';
    }
}
