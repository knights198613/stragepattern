package com.jiangwei.stragepattern.abstractfactory;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: 华硕计算机工厂
 */
public class AsusComputerFactory extends IFactory {

    CpuProduct createCpu() {
        return new AsusCpuProduct();
    }

    MouseProduct createMouse() {
        return new AsusMouseProduct();
    }

    DiskProduct createDisk() {
        return new AsusDiskProduct();
    }
}
