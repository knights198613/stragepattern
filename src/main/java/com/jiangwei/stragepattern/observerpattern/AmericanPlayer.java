package com.jiangwei.stragepattern.observerpattern;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: 具体的盟友  美国大兵盟友
 */
public class AmericanPlayer extends Observer {

    public void helpAllys() {
        System.out.println("坚持住，山姆大叔 "+getName()+" 正向你方来助你！");
    }

    public void attacked(AllyBattleCenter allyBattleCenter) {
        System.out.println("救救我, 鬼子炸了我珍珠港！");
        allyBattleCenter.noticAllObservers(getName());
    }
}
