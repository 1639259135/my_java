package com.lanou3g;

public class Doctor extends Person implements UserInter {

	public Doctor(String name, String userName, String password, String profession){
		super(name, userName, password, profession);
	}

	public void onLine() {
		System.out.println("上班前先消消毒");
		this.operate();
	}
	public void offLine() {
		System.out.println("回家接孩子");
	}
	
	public void operate(){
		System.out.println("操刀动手术");
	}

}
