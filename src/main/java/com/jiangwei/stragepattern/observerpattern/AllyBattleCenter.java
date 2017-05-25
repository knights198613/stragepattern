package com.jiangwei.stragepattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: 抽象的战役指挥中心
 */
public abstract class AllyBattleCenter {

    List<Observer> observerList = new ArrayList<Observer>();

    /**
     * 新增观察者
     * @param observer
     */
    public void addObservers(Observer observer) {
        System.out.println(observer.getName()+"加入战斗联盟");
        observerList.add(observer);
    }

    /**
     * 移除观察者
     * @param observer
     */
    public void removeObserver(Observer observer) {
        System.out.println(observer.getName()+"离开战斗联盟");
        observerList.remove(observer);
    }

    /**
     * 通知观察者（排除当前被攻击的观察者）
     */
    abstract void noticAllObservers(String name);
}
