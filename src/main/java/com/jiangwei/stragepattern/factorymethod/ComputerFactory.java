package com.jiangwei.stragepattern.factorymethod;

/**
 * Created by weijiang
 * Date: 2017/6/13
 * Desc: 电脑工厂
 */
public class ComputerFactory extends ProductFactory {

    public Product createProduct() {
        return new Computer();
    }
}
