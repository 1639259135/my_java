package com.lanou3g.statics;

public class T {
	
	public static int score = 100;
	
	public int a = 1;
	
	public static void show(){
		System.out.println(score);
//		System.out.println(a);  在静态中不能使用非静态的属性
	}
	
	

}
