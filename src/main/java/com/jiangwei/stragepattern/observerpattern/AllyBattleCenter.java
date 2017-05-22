package com.jiangwei.stragepattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: 抽象的战争指挥所
 */
public abstract class AllyBattleCenter {

    List<Observer> observerList = new ArrayList<Observer>();

    /**
     * 注册观察者
     * @param observer
     */
    public void addObservers(Observer observer) {
        System.out.println(observer.getName()+"加入联盟");
        observerList.add(observer);
    }

    /**
     * 移除观察者
     * @param observer
     */
    public void removeObserver(Observer observer) {
        System.out.println(observer.getName()+"离开联盟");
        observerList.remove(observer);
    }

    /**
     * 通知所有的观察者(除当前被攻击的队友)
     */
    abstract void noticAllObservers(String name);
}
