package com.lanou3g.statics;

public class Main {

	public static void main(String[] args) {
		//直接使用类名.变量名
		//就可以找到静态变量
		int a = T.score;
		
		T.score = 400;
		
		
		
		T t1 = new T();
		t1.score = 200;
		T t2 = new T();
		t2.show();
//		t2.a = 20;
		
		
		T.show();
		
		
		
		
		
	}

}
