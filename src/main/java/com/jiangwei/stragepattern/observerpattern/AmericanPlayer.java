package com.jiangwei.stragepattern.observerpattern;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: 美国队 继承抽象的观察者
 */
public class AmericanPlayer extends Observer {

    public void helpAllys() {
        System.out.println("等着"+getName()+"神出鬼没，马上来救你");
    }

    public void attacked(AllyBattleCenter allyBattleCenter) {
        System.out.println("山姆大叔被揍，快来支援");
        allyBattleCenter.noticAllObservers(getName());
    }
}
