package com.jiangwei.stragepattern.prototype;

/**
 * Created by weijiang
 * Date: 2017/6/15
 * Desc:
 */
public class WarDocument extends OfficeDocument {

    public OfficeDocument cloneDocument() {
        try {
            return (OfficeDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制");
            e.printStackTrace();
        }
        return null;
    }

    public void display() {
        System.out.println("this is War Document");
    }
}
