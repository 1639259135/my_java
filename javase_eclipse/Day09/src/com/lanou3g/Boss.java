package com.lanou3g;

public class Boss extends Person implements UserInter{

	public Boss(String name, String userName, String password, String profession){
		super(name, userName, password, profession);
	}
	
	public void onLine(){
		System.out.println("日理万机");
		this.pay();
	}
	public void offLine(){
		System.out.println("下馆子去");
	}
	
	private void pay(){
		System.out.println("来来来,每人1个亿");
	}

}
