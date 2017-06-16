package com.jiangwei.stragepattern.builder;

/**
 * Created by weijiang
 * Date: 2017/6/16
 * Desc: 建造者模式 客户端测试类
 */
public class BuilderClient {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Direct direct = new Direct(builder);
        Product computer = direct.constructor();
        computer.elecDisplay();
    }
}
