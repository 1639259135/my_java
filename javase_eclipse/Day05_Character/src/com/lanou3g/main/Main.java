package com.lanou3g.main;

import test.Student;

public class Main {
	public static void main(String[] args) {
		
//四种修饰符		
		Student stu = new Student();
		stu.smile();
		
		//cry是private修饰的
		//所以在Student类外面找不到的
//		stu.cry();
		
		//angry是protected修饰的
		//所以在test包外面,找不到
		//这就叫同包可以用
		//因为main所在的包,与Student这个类,所在的不是同一个包,所以不可用
//		stu.angry();
		
		//sad方法声明中,没有权限修饰词
		//表示默认的,只有同包下可用
//		stu.sad();
		
		
		
		
		
		
		
	}

}
