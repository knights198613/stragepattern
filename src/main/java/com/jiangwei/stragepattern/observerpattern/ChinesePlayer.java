package com.jiangwei.stragepattern.observerpattern;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: �й������ž�
 */
public class ChinesePlayer extends Observer {

    public void helpAllys() {
        System.out.println("�й�������ž�ս�޲�ʤ��"+getName()+"�ҽ���ѩ��ͻ����֧Ԯ�㣡");
    }

    public void attacked(AllyBattleCenter allyBattleCenter) {
        System.out.println("�Ⱦ���, �ձ�������������");
        allyBattleCenter.noticAllObservers(getName());
    }
}
