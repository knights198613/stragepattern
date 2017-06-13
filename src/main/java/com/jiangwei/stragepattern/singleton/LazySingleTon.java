package com.jiangwei.stragepattern.singleton;

/**
 * Created by weijiang
 * Date: 2017/6/13
 * Desc: 懒汉（后初始化） 单例模式
 */
public class LazySingleTon {

    private static volatile LazySingleTon instance;

    /**
     * 私有的构造器，杜绝外部new实例
     */
    private LazySingleTon() {
        System.out.println("LazySingleTon constructor invoked!");
    }

    /**
     * 全局的获取唯一实例的方法
     * 缺点：如果在构造函数中有大量需要执行的初始化操作，
     * 高并发多线程可能会创建多个实例
     * @return
     */
    public static  LazySingleTon getInstance() {
        if(instance == null) {
            instance = new LazySingleTon();
        }
        return instance;
    }

    /**
     * 线程安全，但是效能低
     * @return
     */
    public synchronized static LazySingleTon getInstance1() {
        if(instance == null) {
            instance = new LazySingleTon();
        }
        return instance;
    }

    /**
     * 锁的力度减小，但是还是存在效能低的问题
     * @return
     */
    public static LazySingleTon getInstance2() {
        synchronized (LazySingleTon.class) {
            if(instance == null) {
                instance = new LazySingleTon();
            }
        }
        return instance;
    }

}
