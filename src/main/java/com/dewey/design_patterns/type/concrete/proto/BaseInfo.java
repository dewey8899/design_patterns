package com.dewey.design_patterns.type.concrete.proto;

/**
 * @author dewey
 * @date 2023/10/3 16:16
 * @function 功能描述
 */
public class BaseInfo implements Cloneable{
    private String productId;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public BaseInfo(String productId) {
        this.productId = productId;
    }

    @Override
    protected BaseInfo clone() throws CloneNotSupportedException {
        return (BaseInfo)super.clone();
    }

    @Override
    public String toString() {
        return "BaseInfo{" +
                "productId='" + productId + '\'' +
                '}';
    }
}
