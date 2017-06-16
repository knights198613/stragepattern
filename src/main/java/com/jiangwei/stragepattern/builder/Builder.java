package com.jiangwei.stragepattern.builder;

/**
 * Created by weijiang
 * Date: 2017/6/16
 * Desc: 抽象的构建者
 */
public interface Builder {
    /**
     * 构建cpu
     */
    void buildCpu();

    /**
     * 构建内存
     */
    void buildMemery();

    /**
     * 构建硬盘
     */
    void buildDisk();

    /**
     * 返回组装后的产品
     * @return
     */
    Product getResult();
}
