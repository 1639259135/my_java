package com.lanou3g.main;

public class Father {
	
	/*
	 * 父亲里面,有一个妻子,一个孩子
	 * 现在我们没有Mother类和Child类
	 * 所以我们去建一个
	 */

	//定义两个属性,分别表示父亲的妻子和孩子
	private Mother wife;
	private Child child;
	
	//表示父亲的名字
	private String name;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	//
	public void setWife(Mother wife){
		this.wife = wife;
	}
	
	public void setChild(Child child){
		this.child = child;
	}
	
	public void showFamily(){
		System.out.println(name + "的妻子是" +wife.getName() + ",孩子是" + child.getName());
	}
	
	
	
	
	
	
	
	
	
	
	
}
