package com.lanou3g.study;

public class Cat {
	private String name;
	private Person onwer;
	
	public Cat(Person owner){	//构造方法
		
		/*
		 * 构造方法:
		 * 		1,方法名与类名相同
		 * 		2,没有返回值这一功能
		 * 
		 * 有了构造方法,还要get/set干甚么?
		 *  首先第一点,get是一定要有的
		 *  在类的外面是无法获得私有属性的
		 *  
		 *  关于set:
		 *    有些属性,并不是每个对象都具有的,
		 *    比如,cat可能会有伴侣,但并不是每个cat在初始化的时候
		 *    都马上有一个伴侣,所以
		 *    可以在后续的使用中,通过set方法给他设置一个
		 */
	
		//将括号中的参数owner的值
		//赋值给了属性owner
		this.onwer = owner;
	}
	
	
	public Person getOnwer() {
		return onwer;
	}
	public void setOnwer(Person onwer) {
		this.onwer = onwer;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
