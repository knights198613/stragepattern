package com.jiangwei.stragepattern.abstractfactory;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: ƻ��CPU
 */
public class AppleCpuProduct implements CpuProduct {

    public void caculator() {
        System.out.println("Apple cpu is caculating...........");
    }

    public void sendComd() {
       System.out.println("Apple cpu is sendComd..........");
    }
}
