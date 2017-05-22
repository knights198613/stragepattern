package com.jiangwei.stragepattern.observerpattern;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: 具体的战争指挥所
 */
public class ConerctBattleCenter extends AllyBattleCenter {
    /**
     * 战争指挥所名称
     */
    private String allyName;

    public String getAllyName() {
        return allyName;
    }

    public void setAllyName(String allyName) {
        this.allyName = allyName;
        System.out.println("联盟已建立，名称："+getAllyName());
    }

    void noticAllObservers(String name) {
        for(Observer observer : observerList) {
            if(!observer.getName().equalsIgnoreCase(name)) {
                observer.helpAllys();
            }
        }
    }
}
