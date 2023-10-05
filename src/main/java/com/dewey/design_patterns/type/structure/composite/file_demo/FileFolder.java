package com.dewey.design_patterns.type.structure.composite.file_demo;


import java.util.ArrayList;
import java.util.List;

/**
 * @author dewey
 * @date 2023/10/5 18:14
 * @function 功能描述
 */
public class FileFolder extends FileComponent{


    private List<FileComponent> componentList;

    public FileFolder(String name,Integer level,Integer type) {
        this.componentList = new ArrayList<>();
        this.name = name;
        this.level = level;
        this.type = type;
    }

    @Override
    public void add(FileComponent component) {
        componentList.add(component);
    }

    @Override
    public void remove(FileComponent component) {
        componentList.remove(component);
    }

    @Override
    public FileComponent getChild(int index) {
        return componentList.get(index);
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.printf("-- ");
        }
        System.out.println(name);
        for (FileComponent fileComponent : componentList) {
            fileComponent.print();
        }
    }

    @Override
    public String toString() {
        return "FileFolder{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", type=" + type +
                '}';
    }
}
