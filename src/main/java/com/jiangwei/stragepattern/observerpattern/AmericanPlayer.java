package com.jiangwei.stragepattern.observerpattern;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: ���������  �����������
 */
public class AmericanPlayer extends Observer {

    public void helpAllys() {
        System.out.println("���ס��ɽķ���� "+getName()+" �����㷽�����㣡");
    }

    public void attacked(AllyBattleCenter allyBattleCenter) {
        System.out.println("�Ⱦ���, ����ը��������ۣ�");
        allyBattleCenter.noticAllObservers(getName());
    }
}
