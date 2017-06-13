package com.jiangwei.stragepattern.factorymethod;

/**
 * Created by weijiang
 * Date: 2017/6/13
 * Desc: 工厂方法模式  客户端测试类
 */
public class FactoryMethodClient {

    public static void main(String[] args) {
        Product product;
        ProductFactory productFactory;
        productFactory = new PhoneFactory();
        product = productFactory.createProduct();
        product.doWork();


        productFactory = new ComputerFactory();
        product = productFactory.createProduct();
        product.doWork();
    }
}
