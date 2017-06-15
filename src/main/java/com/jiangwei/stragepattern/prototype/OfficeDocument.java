package com.jiangwei.stragepattern.prototype;

/**
 * Created by weijiang
 * Date: 2017/6/15
 * Desc: 文档模板
 */
public abstract class OfficeDocument implements Cloneable {
    /**
     * 抽闲的克隆方法
     * @return
     */
    public abstract OfficeDocument cloneDocument();

    /**
     * 抽象的显示方法
     */
    public abstract void display();
}
