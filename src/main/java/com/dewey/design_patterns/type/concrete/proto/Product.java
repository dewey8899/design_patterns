package com.dewey.design_patterns.type.concrete.proto;

/**
 * @author dewey
 * @date 2023/10/3 16:18
 * @function 功能描述
 */
public class Product implements Cloneable{
    private String productName;
    private String part1;
    private String part2;
    private String part3;
    private BaseInfo baseInfo;

    public Product() {
    }

    @Override
    protected Product clone() throws CloneNotSupportedException {
        Product product = (Product) super.clone();
        product.setBaseInfo(product.baseInfo.clone());
        return product;
    }

    public Product(String productName, String part1, String part2, String part3, BaseInfo baseInfo) {
        this.productName = productName;
        this.part1 = part1;
        this.part2 = part2;
        this.part3 = part3;
        this.baseInfo = baseInfo;
    }

    @Override
    public String toString() {
        return super.hashCode() + "Product{" +
                "productName='" + productName + '\'' +
                ", part1='" + part1 + '\'' +
                ", part2='" + part2 + '\'' +
                ", part3='" + part3 + '\'' +
                ", baseInfo=" + baseInfo +
                '}';
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPart1() {
        return part1;
    }

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public String getPart2() {
        return part2;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    public String getPart3() {
        return part3;
    }

    public void setPart3(String part3) {
        this.part3 = part3;
    }

    public BaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }
}
