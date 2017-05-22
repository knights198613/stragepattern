package com.jiangwei.stragepattern.abstractfactory;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: 抽象工厂类
 */
public abstract class IFactory {
    /**
     * 生产CPU
     * @return
     */
    abstract CpuProduct createCpu();

    /**
     * 生产鼠标
     * @return
     */
    abstract MouseProduct createMouse();

    /**
     * 生产硬盘
     * @return
     */
    abstract DiskProduct createDisk();
}
