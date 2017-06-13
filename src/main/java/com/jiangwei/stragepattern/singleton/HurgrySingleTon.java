package com.jiangwei.stragepattern.singleton;

/**
 * Created by weijiang
 * Date: 2017/6/13
 * Desc: 饿汉 单例模式
 */
public class HurgrySingleTon {
    /**
     * 类加载时初始化类常量，利用JVM的线程安全机制保障了唯一实例
     * 缺点：类加载就会创建，不管是否使用到，占用一定的内存
     */
    private static final HurgrySingleTon instance = new HurgrySingleTon();

    private HurgrySingleTon() {
        System.out.println("HurgrySingleTon constructor invoked!");
    }

    /**
     * 公共的获取唯一实例的方法入口
     * @return
     */
    public static HurgrySingleTon getInstance() {
        return instance;
    }
}
