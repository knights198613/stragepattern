package com.jiangwei.stragepattern.factorymethod;

/**
 * Created by weijiang
 * Date: 2017/6/13
 * Desc: 手机工厂
 */
public class PhoneFactory extends ProductFactory {

    public Product createProduct() {
        return new Phone();
    }
}
