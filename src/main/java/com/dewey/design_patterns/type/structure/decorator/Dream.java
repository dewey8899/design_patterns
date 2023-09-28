package com.dewey.design_patterns.type.structure.decorator;

/**
 * @Author dewey.du
 * @Date 2023/9/27 9:51
 * @Project design_patterns
 **/
public class Dream implements Anything{
    private Anything anything;
    public Dream(Anything anything){
        this.anything = anything;
    }
    @Override
    public void exe() {
        System.out.print("梦装饰了 ");
        anything.exe();
    }
}
