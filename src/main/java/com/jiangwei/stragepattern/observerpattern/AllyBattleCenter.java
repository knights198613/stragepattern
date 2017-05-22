package com.jiangwei.stragepattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: �����ս��ָ����
 */
public abstract class AllyBattleCenter {

    List<Observer> observerList = new ArrayList<Observer>();

    /**
     * ע��۲���
     * @param observer
     */
    public void addObservers(Observer observer) {
        System.out.println(observer.getName()+"��������");
        observerList.add(observer);
    }

    /**
     * �Ƴ��۲���
     * @param observer
     */
    public void removeObserver(Observer observer) {
        System.out.println(observer.getName()+"�뿪����");
        observerList.remove(observer);
    }

    /**
     * ֪ͨ���еĹ۲���(����ǰ�������Ķ���)
     */
    abstract void noticAllObservers(String name);
}
