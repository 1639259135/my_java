package com.lanou3g.task01;

public class Doctor extends Person {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return super.getUserName();
	}

	@Override
	public void setUserName(String userName) {
		// TODO Auto-generated method stub
		super.setUserName(userName);
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return super.getPassword();
	}

	@Override
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		super.setPassword(password);
	}

	@Override
	public String getProfession() {
		// TODO Auto-generated method stub
		return super.getProfession();
	}

	@Override
	public void setProfession(String profession) {
		// TODO Auto-generated method stub
		super.setProfession(profession);
	}
	
	
	public void operate(){
		System.out.println("准备一下,马上操刀动手术");
	}

}
