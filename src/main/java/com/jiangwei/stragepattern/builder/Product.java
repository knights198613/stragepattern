package com.jiangwei.stragepattern.builder;

/**
 * Created by weijiang
 * Date: 2017/6/16
 * Desc: 产品类（由零件类组成）
 */
public class Product {
    /**
     * cpu零件 （也可以是对象）
     */
    private String cpu;
    /**
     * 内存零件 （也可以对象）
     */
    private String memery;
    /**
     * 硬盘零件 （也可以是对象）
     */
    private String disk;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemery() {
        return memery;
    }

    public void setMemery(String memery) {
        this.memery = memery;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    /**
     * BIOS启动输出配置信息
     */
    public void elecDisplay() {
       System.out.println("cpu:"+this.cpu+", memery:"+this.memery+", disk:"+disk);
    }
}
