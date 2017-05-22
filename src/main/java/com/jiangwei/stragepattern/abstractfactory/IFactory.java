package com.jiangwei.stragepattern.abstractfactory;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: ���󹤳���
 */
public abstract class IFactory {
    /**
     * ����CPU
     * @return
     */
    abstract CpuProduct createCpu();

    /**
     * �������
     * @return
     */
    abstract MouseProduct createMouse();

    /**
     * ����Ӳ��
     * @return
     */
    abstract DiskProduct createDisk();
}
