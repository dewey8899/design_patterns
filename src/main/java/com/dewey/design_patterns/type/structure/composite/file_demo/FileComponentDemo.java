package com.dewey.design_patterns.type.structure.composite.file_demo;

/**
 * @author dewey
 * @date 2023/10/5 18:26
 * @function 功能描述
 */
public class FileComponentDemo {
    public static void main(String[] args) {
        FileComponent root = new FileFolder("我是根目录", 1, 1);
        FileComponent folder1 = new FileFolder("我是二级目录", 2, 1);
        FileComponent folder2 = new FileFolder("我是三级目录2", 3, 1);
        FileComponent fileComponent3 = new File("我是文件", 2, 2);
        FileComponent fileComponent32 = new File("我是文件2", 3, 2);
        FileComponent fileComponent33 = new File("我是文件3", 3, 2);
        root.add(folder1);
        root.add(fileComponent3);
        folder1.add(fileComponent3);
        folder1.add(fileComponent32);
        folder1.add(folder2);
        root.print();
        FileComponent child = folder1.getChild(0);
        folder1.remove(fileComponent33);
        System.out.println(child.toString());
    }
}
