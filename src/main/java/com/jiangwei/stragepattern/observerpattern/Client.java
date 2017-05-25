package com.jiangwei.stragepattern.observerpattern;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: 观察者测试客户端
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
        american.setName("海豹突击队");

        chinese = new ChinesePlayer();
        chinese.setName("人民解放军队");

        russia = new RussiaPlayer();
        russia.setName("疯狂尤里队");


        conerctBattleCenter.addObservers(american);
        conerctBattleCenter.addObservers(chinese);
        conerctBattleCenter.addObservers(russia);

        //毛子被攻击
        russia.attacked(conerctBattleCenter);

    }
}
