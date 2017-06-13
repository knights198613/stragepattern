package com.jiangwei.stragepattern.singleton;

/**
 * Created by weijiang
 * Date: 2017/6/13
 * Desc: 单例客户端测试类
 */
public class SingleTonClient {

    public static void main(String[] args) {
        LazySingleTon lazySingleTon = LazySingleTon.getInstance();
        LazySingleTon lazySingleTon1 = LazySingleTon.getInstance1();
        System.out.println(lazySingleTon == lazySingleTon1);

        HurgrySingleTon hurgrySingleTon = HurgrySingleTon.getInstance();
        HurgrySingleTon hurgrySingleTon1 = HurgrySingleTon.getInstance();

        System.out.println(hurgrySingleTon == hurgrySingleTon1);

    }
}
