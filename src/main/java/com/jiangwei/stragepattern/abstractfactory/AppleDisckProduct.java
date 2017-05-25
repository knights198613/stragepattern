package com.jiangwei.stragepattern.abstractfactory;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: 苹果硬盘产品
 */
public class AppleDisckProduct implements DiskProduct {

    public Long write() {
        System.out.println("Apple disk is writing........");
        return 189L;
    }

    public String read() {
        System.out.println("Apple disk is reading.......");
        return "nmljsfljsd";
    }
}
