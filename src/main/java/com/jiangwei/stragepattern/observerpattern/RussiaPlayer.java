package com.jiangwei.stragepattern.observerpattern;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: 毛子队
 */
public class RussiaPlayer extends Observer {

    public void helpAllys() {
        System.out.println("喝口伏特加等着, "+getName()+"我将支援你");
    }

    public void attacked(AllyBattleCenter allyBattleCenter) {
        System.out.println("赶快救救我，伏特加被偷走了");
        allyBattleCenter.noticAllObservers(getName());
    }
}
