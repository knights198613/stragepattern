package com.jiangwei.stragepattern.observerpattern;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: ë�� ħ�����
 */
public class RussiaPlayer extends Observer {

    public void helpAllys() {
        System.out.println("����С��, "+getName()+" �ҽ�֧Ԯ�㣬������");
    }

    public void attacked(AllyBattleCenter allyBattleCenter) {
        System.out.println("�Ⱦ���, �¹�������������");
        allyBattleCenter.noticAllObservers(getName());
    }
}
