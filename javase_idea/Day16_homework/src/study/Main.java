package study;

import study.componet.可乐Component;
import study.decorator.兑水Decorator;
import study.decorator.加醋Decorator;

public class Main {
    public static void main(String[] args) {
        //来杯可乐
        可乐Component 可乐 = new 可乐Component();

        兑水Decorator 兑水 = new 兑水Decorator(可乐);

        System.out.println(兑水.getName() + "\t" + 兑水.price());

        加醋Decorator 加醋 = new 加醋Decorator(兑水);

        System.out.println(加醋.getName() + "\t" + 加醋.price());


    }
}
