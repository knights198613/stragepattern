package com.jiangwei.stragepattern.singleton;

import java.util.Random;

/**
 * Created by weijiang
 * Date: 2017/6/13
 * Desc: 测试jvm自身线程保证static final修饰的类常量的安全
 */
public class ThreadSafeTest {

    private static final int x = getValue();

    private final int y = getValue();

    private static int getValue() {
        return new Random().nextInt(100);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static void main(String[] args) {
        ThreadSafeTest test = new ThreadSafeTest();
        ThreadSafeTest test1 = new ThreadSafeTest();
        System.out.println(test.getX());
        System.out.println(test1.getX());

        System.out.println(test.getY());
        System.out.println(test1.getY());

    }
}
