package com.jiangwei.stragepattern.abstractfactory;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: ƻ�����������
 */
public class AppleComputerFactory extends IFactory {

    CpuProduct createCpu() {
        return new AppleCpuProduct();
    }

    MouseProduct createMouse() {
        return new AppleMouseProduct();
    }

    DiskProduct createDisk() {
        return new AppleDisckProduct();
    }
}
