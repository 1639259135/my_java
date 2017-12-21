package com.lanou3g.study.extend;

public class Animal {
	/*
	 * 什么是继承
	 * 	java面向对象三大特性之一
	 * 		封装,继承,多态
	 * 
	 * 	子类可以继承父类的属性和方法
	 * 
	 *  创建一个类Pig,使用extends关键字继承Animal这个类
	 * 
	 */
	
	
//	public Animal(){
//		System.out.println("--------动物动物---------");
//	}
	
	
	//表种族
	private String kind;
	
	public Animal(String kind){
		this.kind = kind;
		System.out.println("这个动物种族为:" + kind);
	}

	public void sleep(){
		System.out.println("睡一会儿");
	}
	
	
	

	
	
	
}
