package com.jiangwei.stragepattern.observerpattern;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: 中国人民解放军
 */
public class ChinesePlayer extends Observer {

    public void helpAllys() {
        System.out.println("中国人名解放军战无不胜，"+getName()+"我将派雪豹突击队支援你！");
    }

    public void attacked(AllyBattleCenter allyBattleCenter) {
        System.out.println("救救我, 日本鬼子来打我了");
        allyBattleCenter.noticAllObservers(getName());
    }
}
