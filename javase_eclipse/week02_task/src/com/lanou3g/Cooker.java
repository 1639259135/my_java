package com.lanou3g;

public class Cooker extends Person implements UserInter{
	public Cooker(){
		super();
	}

	public Cooker(String name, String userName, String password, String profession){
		super(name, userName, password, profession);
	}

	public void onLine() {
		System.out.println("大厨来了");
		this.toss();
	}
	public void offLine() {
		System.out.println("好累哟");
	}
	
	public void toss(){
		System.out.println("红烧肉出锅了");
	}

}
