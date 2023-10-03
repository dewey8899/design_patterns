package com.dewey.design_patterns.type.concrete.proto;

import cn.hutool.core.bean.BeanUtil;

/**
 * @Author dewey.du
 * @Date 2023/9/27 9:19
 * @Project design_patterns
 * 原型模式
 **/
public class ProtoType {
    public static void main(String[] args) throws CloneNotSupportedException {
        BaseInfo baseInfo = new BaseInfo("dewey is writing the prototype pattern in national festival");
        Product product = new Product("iphone 15 pro max", "mirror", "screen", "body", baseInfo);
        System.out.println(System.currentTimeMillis());
        Product clone = product.clone();
        System.out.println(System.currentTimeMillis());
        Product target = new Product();
        BeanUtil.copyProperties(product, target);
        System.out.println(System.currentTimeMillis());
        //三个时间差就知道  clone的性能有多好了。
        // 在内存中进行二进制流的拷贝，要比直接new一个对象性能好，特别是在一个循环体内创建大量对象时
    }

}
