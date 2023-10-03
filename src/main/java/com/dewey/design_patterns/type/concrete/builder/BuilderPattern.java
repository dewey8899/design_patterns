package com.dewey.design_patterns.type.concrete.builder;

/**
 * @author dewey
 * @date 2023/10/3 16:50
 * @function 功能描述
 */
public class BuilderPattern {

    public static void main(String[] args) {
        Product product = new Product.ProductBuilder().productName("xxx").part1("1").part2("2").part3("3").build();
        System.out.println(product.toString());

        Person person = Person.builder().age(18).firstName("du").lastName("wei").build();
        System.out.println(person);
    }


}

