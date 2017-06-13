package com.jiangwei.stragepattern.simplefactory;

/**
 * Created by weijiang
 * Date: 2017/6/13
 * Desc: 产品生产工厂  简单工厂模式
 * 缺点：添加一种产品需要重写工厂类，破坏了OCP原则
 * 工厂中获取产品的方法太多if else 判断
 * 优点：对于客户端封装了具体的new 产品的过程，使客户端透明
 */
public class ProductFactory {

    public static Product getProdcutInstance(String type) {
        if(type.equals("phone")) {
            return new Phone();
        }else if(type.equals("computer")) {
            return new Computer();
        }else {
            return null;
        }
    }
}
