package com.jiangwei.stragepattern.abstractfactory;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: 硬盘产品接口
 */
public interface DiskProduct {

    public Long write();

    public String read();
}
