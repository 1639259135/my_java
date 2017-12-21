package com.lanou3g.study.extend;

public class Monkey extends Animal{

	public Monkey() {
		
		//super()就是在调用父类的空参数的构造方法
		//super(猴子)就是在调用父类的参数类型为String的构造方法
		super("猴子");
		System.out.println("I am a 齐天大圣");
		
	}

	@Override
	public void sleep() {
		//super.sleep()是在调用父类的sleep方法
		System.out.println("我是猴子的睡觉方法");
		super.sleep();
	}
	
	
	
	

}
