package com.lanou3g;

public class Worker extends Person implements UserInter{

	public Worker(){
		super();
	}

	public Worker(String name, String userName, String password, String profession){
		super(name, userName, password, profession);
	}

	public void onLine(){
		System.out.println("开始干活咯");
		this.eat();
	}
	public void offLine(){
		System.out.println("终于下班了");
	}
	
	
	public void eat(){
		System.out.println("开饭了");
	}
	
}
