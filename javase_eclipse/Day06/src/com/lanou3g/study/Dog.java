package com.lanou3g.study;

public class Dog {
	
	/*
	 * 构造方法的重载:
	 * 	方法名相同,(构造方法的方法名都是类名)
	 * 参数列表不同
	 * 		参数的个数,参数的类型,参数的顺序
	 * 		这三个因素,只要有一个不同,参数列表就不同
	 */
	public Dog(){
		System.out.println("这是默认的空参的构造方法");
	}
	
	public Dog(String name){
		System.out.println("这是带参数的构造方法,参数的名字:" + name);
	}
	
	public Dog(String name,int age){
		
	}
	
	public Dog(int age,String name){
		
	}
	
	
	
	//方法的重载
	/*方法重载的条件
	 * 		方法名相同,参数列表不同
	 * 		与返回值和权限修饰符无关
	 * 	
	 */
	public void eatBone(){
		System.out.println("他以为他在啃骨头");
	}
	
	public String eatBone(String n){
		return "狗头";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

