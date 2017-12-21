package com.lanou3g.inter;

/**
 * 问档注释
 * WatchDog类,通过implemaents关键字
 * 与Work接口产生了关联,导致WatchDog就满足了Work这个接口
 * 
 * implements关键字:实现
 * 	通过implements关键字,可以让一个类
 * 	实现多个接口,多个接口之间使用逗号隔开
 * 	这样就让这个类,满足了接口的规范
 * 	也叫作实现了接口
 * 
 * A继承了B,那么A叫做子类,B叫做父类
 * A实现了B,那么A叫做实现类,B叫做接口
 * 
 * 
 * @author lanou3g
 *
 */
public class WatchDog implements Work{

	@Override
	public void work() {
		System.out.println("上岗了,谁来咬");	
	}
	public void goHome(){
		System.out.println("回窝啃骨头啦");
	}

}
