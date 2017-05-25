package com.jiangwei.stragepattern.observerpattern;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: 中国队
 */
public class ChinesePlayer extends Observer {

    public void helpAllys() {
        System.out.println("坚持住"+getName()+"马上派兵速援你");
    }

    public void attacked(AllyBattleCenter allyBattleCenter) {
        System.out.println("救命，中国队被攻击了");
        allyBattleCenter.noticAllObservers(getName());
    }
}
