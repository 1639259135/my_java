package com.lanou3g.study;

public class Main {
	public static void main(String[] args) {
		
		//我们一直写new xxx();
		//实际上这个xxx();就是构造方法
		//只不过这个构造方法是没有参数的
		//每一个类中都会有一个,默认的没有参数的构造方法
		//没有参数我们就称之为空参
		//刚刚我们自己在Cat中写了一个带参数的构造该方法
		//那么就把默认的空参数覆盖
		//这里的new Cat()还是去找空参数的构造方法
		//就找不到了,就报错了
//		Cat cat = new Cat();
		
		Person zhangsan = new Person();
		Cat cat = new Cat(zhangsan);

		
		//这是在创建对象后,设置name属性
		cat.setName("TOM");
		
		//给cat对象,设置一个主人
//		cat.setOnwer(zhangsan);
		
		
		/*
		 * 我们的要求是,对每个Cat被创建出来时
		 * 都已经有了一个主人
		 * 而set方法,是在对象被创建后,才可以调用执行的
		 * 这不符合我们的要求
		 * 
		 * java给我们提供了一个叫构造方法的东西,可以帮助我们在对象初始化时,给属性赋值
		 */
		
	}
}
