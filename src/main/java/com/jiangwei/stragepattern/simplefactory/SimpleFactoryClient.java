package com.jiangwei.stragepattern.simplefactory;

/**
 * Created by weijiang
 * Date: 2017/6/13
 * Desc: 简单工厂模式 测试客户端
 */
public class SimpleFactoryClient {

    public static void main(String[] args) {
        Product product = ProductFactory.getProdcutInstance("phone");
        product.doWork();

        Product product1 = ProductFactory.getProdcutInstance("computer");
        product1.doWork();
    }
}
