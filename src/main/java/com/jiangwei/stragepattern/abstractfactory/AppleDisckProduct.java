package com.jiangwei.stragepattern.abstractfactory;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: Æ»¹ûÓ²ÅÌ
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
