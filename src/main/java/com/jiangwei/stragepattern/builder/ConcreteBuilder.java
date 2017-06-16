package com.jiangwei.stragepattern.builder;

/**
 * Created by weijiang
 * Date: 2017/6/16
 * Desc: 具体的构建者
 */
public class ConcreteBuilder implements Builder {

    private Product product = new Product();

    public void buildCpu() {
        product.setCpu("Intel i5");
    }

    public void buildMemery() {
        product.setMemery("KingSton");
    }

    public void buildDisk() {
       product.setDisk("West Data");
    }

    public Product getResult() {
        return product;
    }
}
