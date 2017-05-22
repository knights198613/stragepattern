package com.jiangwei.stragepattern.observerpattern;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: 毛子 魔鬼兵团
 */
public class RussiaPlayer extends Observer {

    public void helpAllys() {
        System.out.println("别怕小弟, "+getName()+" 我将支援你，乌拉！");
    }

    public void attacked(AllyBattleCenter allyBattleCenter) {
        System.out.println("救救我, 德国鬼子来打我了");
        allyBattleCenter.noticAllObservers(getName());
    }
}
