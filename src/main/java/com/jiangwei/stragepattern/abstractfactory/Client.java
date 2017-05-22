package com.jiangwei.stragepattern.abstractfactory;

import java.util.Scanner;

/**
 * Created by weijiang
 * Date: 2017/5/22
 * Desc: 抽象工厂的客户端
 */
public class Client {

    public static void main(String[] args) {
        IFactory iFactory;

        int x = 0;
        System.out.println("请选择你所要组装电脑的耗材： 1：Asus电脑   2：苹果电脑 3:退出");
        Scanner scanner = new Scanner(System.in);

        while(true) {
            x = Integer.valueOf(scanner.nextLine());
            if(x==1) {
                iFactory = new AsusComputerFactory();
                CpuProduct cpuProduct = iFactory.createCpu();
                cpuProduct.caculator();
                cpuProduct.sendComd();
                DiskProduct diskProduct = iFactory.createDisk();
                diskProduct.write();
                diskProduct.read();
                MouseProduct mouseProduct = iFactory.createMouse();
                mouseProduct.point();
                x=1000;
            }
            if(x==2) {
                iFactory = new AppleComputerFactory();
                CpuProduct cpuProduct = iFactory.createCpu();
                cpuProduct.caculator();
                cpuProduct.sendComd();
                DiskProduct diskProduct = iFactory.createDisk();
                diskProduct.write();
                diskProduct.read();
                MouseProduct mouseProduct = iFactory.createMouse();
                mouseProduct.point();
                x=1000;
            }

            if(x==3)
                break;
        }

    }
}
