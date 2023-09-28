package com.dewey.design_patterns.type.structure.decorator;

/**
 * @Author dewey.du
 * @Date 2023/9/27 9:51
 * @Project design_patterns
 **/
public class Moon implements Anything{
    private Anything anything;
    public Moon(Anything anything){
        this.anything = anything;
    }
    @Override
    public void exe() {
        System.out.print("明月装饰了 ");
        anything.exe();
    }
}
