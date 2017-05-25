package com.jiangwei.stragepattern.observerpattern;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: 观察者抽象类
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
     * 帮助队友
     */
    public abstract void helpAllys();

    /**
     * 被攻击发出救援
     * @param allyBattleCenter
     */
    public abstract void attacked(AllyBattleCenter allyBattleCenter);
}
