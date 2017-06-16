package com.jiangwei.stragepattern.builder;

/**
 * Created by weijiang
 * Date: 2017/6/16
 * Desc: 指挥者 (销售经理)
 */
public class Direct {

    Builder builder;

    public Direct(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    /**
     * 构建方法 （决定如何构建产品）
     * @return
     */
    public Product constructor() {
        builder.buildCpu();
        builder.buildMemery();
        builder.buildDisk();
        return builder.getResult();
    }
}
