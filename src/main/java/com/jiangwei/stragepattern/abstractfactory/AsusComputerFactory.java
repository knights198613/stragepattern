package com.jiangwei.stragepattern.abstractfactory;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: ��˶���������
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
