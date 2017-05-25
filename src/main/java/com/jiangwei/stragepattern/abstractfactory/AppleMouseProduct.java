package com.jiangwei.stragepattern.abstractfactory;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: 苹果鼠标产品
 */
public class AppleMouseProduct implements MouseProduct {

    public void point() {
        System.out.println("Apple mouse is pointing...........");
    }
}
