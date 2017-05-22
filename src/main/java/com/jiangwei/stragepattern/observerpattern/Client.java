package com.jiangwei.stragepattern.observerpattern;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: �۲���ģʽ�Ŀͻ���
 */
public class Client {

    public static void main(String[] args) {
        ConerctBattleCenter conerctBattleCenter;
        AmericanPlayer american;
        ChinesePlayer chinese;
        RussiaPlayer russia;


        conerctBattleCenter = new ConerctBattleCenter();
        conerctBattleCenter.setAllyName("а������");

        american = new AmericanPlayer();
        american.setName("����̹�˴��");

        chinese = new ChinesePlayer();
        chinese.setName("С�׼Ӳ�ǹ��");

        russia = new RussiaPlayer();
        russia.setName("ս�������");


        conerctBattleCenter.addObservers(american);
        conerctBattleCenter.addObservers(chinese);
        conerctBattleCenter.addObservers(russia);

        //ë�ӱ��¾�����
        russia.attacked(conerctBattleCenter);

    }
}
