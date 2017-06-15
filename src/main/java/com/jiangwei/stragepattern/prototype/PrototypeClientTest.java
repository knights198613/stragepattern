package com.jiangwei.stragepattern.prototype;

/**
 * Created by weijiang
 * Date: 2017/6/15
 * Desc: 原型模式 客户端测试类
 */
public class PrototypeClientTest {

    public static void main(String[] args) {
        PrototypeManager pm = PrototypeManager.getInstance();
        JarDocument jarDocument = new JarDocument();
        WarDocument warDocument = new WarDocument();
        pm.addDocument("jar", jarDocument).addDocument("war", warDocument);


        OfficeDocument jar1 = pm.getDocument("jar");
        OfficeDocument war1 = pm.getDocument("war");
        OfficeDocument jar2 = pm.getDocument("jar");
        OfficeDocument war2 = pm.getDocument("war");

        jar1.display();
        war1.display();

        System.out.println(jar2 == jar1);
        System.out.println(war2 == war1);

    }
}
