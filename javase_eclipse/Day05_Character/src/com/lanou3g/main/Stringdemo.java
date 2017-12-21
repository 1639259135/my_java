package com.lanou3g.main;

public class Stringdemo {

	public static void main(String[] args) {
		
		/*
		 * String类
		 * 表示字符串
		 * 注意,字符串不是基本数据类型
		 */
		
		//字符串是不可变的,当一个字符串被创建后,他就不能让再发生变化
		String s1 = "张三";
		String s2 = "张三";
		String s3 = new String("张三");
		String s4 = new String("张三");
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		
		//equals是字符串的方法
		//主要是字符串,都可以使用这个方法
		//判断两个字符串的内容是否相等
		boolean bo = s3.equals(s4);
		System.out.println(bo);
		
		

	}

}