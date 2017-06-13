package com.jiangwei.stragepattern.singleton;

/**
 * Created by weijiang
 * Date: 2017/6/13
 * Desc: Initialization Demand Holder (IoDH) 技术 单例
 */
public class IoDHSingleTon {
    /**
     * 私有的构造器，防止外部new实例
     */
    private IoDHSingleTon() {
        System.out.println("IoDHSingleTon constructor invoked!");
    }

    /**
     * 内部私有类持有当前类的唯一实例，
     * 当内部私有类加载时利用JVM的线程安全机制来保证，
     * 防止外部直接使用
     */
    private static class HolderClass {
        private static final IoDHSingleTon instance = new IoDHSingleTon();
    }

    /**
     * 全局的获取唯一实例的方法
     * @return
     */
    public static IoDHSingleTon getInstance() {
        return HolderClass.instance;
    }
}
