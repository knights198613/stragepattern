package com.jiangwei.stragepattern.abstractfactory;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: 华硕CPU产品
 */
public class AsusCpuProduct implements CpuProduct {

    public void caculator() {
        System.out.println("Asus cpu is caculating...............");
    }

    public void sendComd() {
       System.out.println("Asus cpu sendComd............");
    }
}
