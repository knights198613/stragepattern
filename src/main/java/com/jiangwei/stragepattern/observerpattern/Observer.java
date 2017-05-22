package com.jiangwei.stragepattern.observerpattern;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: ����۲���
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
     * �����֧Ԯ���ѵķ���
     */
    public abstract void helpAllys();

    /**
     * ����ı�����ʱ�ķ���
     * @param allyBattleCenter
     */
    public abstract void attacked(AllyBattleCenter allyBattleCenter);
}
