package com.dewey.design_patterns.type.concrete.builder;

/**
 * @author dewey
 * @date 2023/10/3 17:07
 * @function 功能描述
 */
public class Product {

    private final String productName;
    private final String part1;
    private final String part2;
    private final String part3;

    public static ProductBuilder builder(){
        return new ProductBuilder();
    }

    public static class ProductBuilder {
        private String productName;
        private String part1;
        private String part2;
        private String part3;

        public ProductBuilder productName(String productName) {
            this.productName = productName;
            return this;
        }

        public ProductBuilder part1(String part1) {
            this.part1 = part1;
            return this;
        }

        public ProductBuilder part2(String part2) {
            this.part2 = part2;
            return this;
        }

        public ProductBuilder part3(String part3) {
            this.part3 = part3;
            return this;
        }

        Product build() {
            return new Product(this.productName, this.part1, this.part2, this.part3);
        }
    }

    public Product(String productName, String part1, String part2, String part3) {
        this.productName = productName;
        this.part1 = part1;
        this.part2 = part2;
        this.part3 = part3;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", part1='" + part1 + '\'' +
                ", part2='" + part2 + '\'' +
                ", part3='" + part3 + '\'' +
                '}';
    }
}
