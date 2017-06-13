package com.jiangwei.stragepattern.factorymethod;

/**
 * Created by weijiang
 * Date: 2017/6/13
 * Desc: 抽象工厂类
 */
public abstract class ProductFactory {
    /**
     * 抽象的创建产品方法
     * @return
     */
    public abstract Product createProduct();
}
