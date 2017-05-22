package com.jiangwei.stragepattern.observerpattern;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: 抽象观察者
 */
public abstract class Observer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 抽象的支援队友的方法
     */
    public abstract void helpAllys();

    /**
     * 抽象的被攻击时的方法
     * @param allyBattleCenter
     */
    public abstract void attacked(AllyBattleCenter allyBattleCenter);
}
