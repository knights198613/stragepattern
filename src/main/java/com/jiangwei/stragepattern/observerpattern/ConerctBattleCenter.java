package com.jiangwei.stragepattern.observerpattern;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: �����ս��ָ����
 */
public class ConerctBattleCenter extends AllyBattleCenter {
    /**
     * ս��ָ��������
     */
    private String allyName;

    public String getAllyName() {
        return allyName;
    }

    public void setAllyName(String allyName) {
        this.allyName = allyName;
        System.out.println("�����ѽ��������ƣ�"+getAllyName());
    }

    void noticAllObservers(String name) {
        for(Observer observer : observerList) {
            if(!observer.getName().equalsIgnoreCase(name)) {
                observer.helpAllys();
            }
        }
    }
}
