package com.dewey.design_patterns.type.structure.facade;

/**
 * @author dewey
 * @date 2023/10/3 19:32
 * @function 功能描述
 */
public class FacadeTest {

    public static void main(String[] args) {
        Client1 client1 = new Client1();
        client1.pritlnSomething();
    }
}

//客户端1
class Client1{
    Facade facade = new Facade();

    public void pritlnSomething(){
        //使用门面模式来统一调用
        facade.printAll();
    }
}

//门面模式，有Facade来统一调用需要调用的方法
class Facade{
    SubMessage1 subMessage1 = new SubMessage1();
    SubMessage2 subMessage2 = new SubMessage2();
    SubMessage3 subMessage3 = new SubMessage3();

    public void printAll(){
        subMessage1.printSub1();
        subMessage2.printSub2();
        subMessage3.printSub3();
    }
}

//子类
class SubMessage1{
    public void printSub1(){
        System.out.println("printSub1...");
    }
}

class SubMessage2{
    public void printSub2(){
        System.out.println("printSub2...");
    }
}

class SubMessage3{
    public void printSub3(){
        System.out.println("printSub3...");
    }
}
