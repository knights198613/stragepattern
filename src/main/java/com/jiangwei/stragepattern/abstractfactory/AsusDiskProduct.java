package com.jiangwei.stragepattern.abstractfactory;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: »ªË¶Ó²ÅÌ
 */
public class AsusDiskProduct implements DiskProduct {
    public Long write() {
        System.out.println("Asus disk is writing.........");
        return 11L;
    }

    public String read() {
        System.out.println("Asus disk is reading.......");
        return "abcdefghijklmn";
    }
}
