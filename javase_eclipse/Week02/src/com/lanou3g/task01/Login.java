package com.lanou3g.task01;

public class Login {
	private String userName;
	private String password;
	
	
	UserData ar = new UserData();
	private UserInter ui;
	
	public void setOnLine(UserInter ui){
		this.ui = ui;
	}
	public void setOffLine(UserInter ui){
		this.ui = ui;
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	
//	public void login(String userName, String password){
//		
//		for(int i = 0; i < 4; i ++){
//			for(int j = 1; j < 3; j ++){
//				if(userName == array[i][j]){
//					
//				}
//			}
//		}
//		this.ui.onLine();
//		this.ui.offLine();
//	}

}
