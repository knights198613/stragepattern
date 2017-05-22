package com.jiangwei.stragepattern.observerpattern;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: 观察者模式的客户端
 */
public class Client {

    public static void main(String[] args) {
        ConerctBattleCenter conerctBattleCenter;
        AmericanPlayer american;
        ChinesePlayer chinese;
        RussiaPlayer russia;


        conerctBattleCenter = new ConerctBattleCenter();
        conerctBattleCenter.setAllyName("邪恶联盟");

        american = new AmericanPlayer();
        american.setName("美国坦克大队");

        chinese = new ChinesePlayer();
        chinese.setName("小米加步枪队");

        russia = new RussiaPlayer();
        russia.setName("战斗名族对");


        conerctBattleCenter.addObservers(american);
        conerctBattleCenter.addObservers(chinese);
        conerctBattleCenter.addObservers(russia);

        //毛子被德军攻击
        russia.attacked(conerctBattleCenter);

    }
}
