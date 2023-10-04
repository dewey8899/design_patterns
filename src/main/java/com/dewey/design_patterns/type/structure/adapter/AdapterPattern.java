package com.dewey.design_patterns.type.structure.adapter;

/**
 * @author dewey
 * @date 2023/10/3 19:39
 * @function 功能描述
 */
public class AdapterPattern {
    public static void main(String[] args) {
        Target adapter = new Adapter(new Adaptee());
        adapter.adapter10v();
    }
}
interface Target{
    int adapter10v();
}
class Adapter implements Target{

    private final Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int adapter10v() {
        int i = this.adaptee.adapter220v();
        System.out.println("适配了10v充电器");
        return i / 22;

    }
}
class Adaptee{
    public int adapter220v(){
        return 220;
    }
}
