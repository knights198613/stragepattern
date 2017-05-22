package com.jiangwei.stragepattern.abstractfactory;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: 硬盘的产品接口类
 */
public interface DiskProduct {

    public Long write();

    public String read();
}
