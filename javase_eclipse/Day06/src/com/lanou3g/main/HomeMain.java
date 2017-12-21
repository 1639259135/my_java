package com.lanou3g.main;

public class HomeMain {
	public static void main(String[] args) {
		
		Father father = new Father();
		//创建好father后,给他一个名字
		father.setName("马玉爸爸");
		Mother mother = new Mother();
		mother.setName("围裙妈妈");
		Child child = new Child();
		child.setName("毛泽宇");
		
		father.setWife(mother);
		father.setChild(child);
		
		mother.setHusband(father);
		mother.setChild(child);
		
		child.setFather(father);
		child.setMother(mother);
		
		father.showFamily();
		mother.showFamily();
		child.showFamily();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
