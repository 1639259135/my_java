package com.lanou3g;

import homework.BOSS;
import homework.Cooker;
import homework.Doctor;
import homework.Worker;

public class Login {
	
	UserData userData = new UserData();
	
	public UserData getUd() {
		return userData;
	}
	public void setUd(UserData ud) {
		this.userData = ud;
	}

	public void login(String userName, String password){	
		for(int i = 0; i < userData.getUd().length; i ++) {
			String name = userData.getUd()[i][0];
			String un = userData.getUd()[i][1];
			String pa = userData.getUd()[i][2];
			String pr = userData.getUd()[i][3];

			if (userName.equals(userData.getUd()[i][1]) && password.equals(userData.getUd()[i][2])) {
				System.out.println("濮撳悕:" + userData.getUd()[i][0] + "\t" + "鑱屼笟:" + userData.getUd()[i][3]);

				switch (pr) {
					case "Worker":
						return new Worker(name,un, pa, pr);
					case "Doctor":
						return new Doctor(name,un, pa, pr);
					case "Cooker":
						return new Cooker(name,un, pa, pr);
					case "Boss":
						return new Boss(name,un, pa, pr);
				}
			}
			System.out.println("杈撳叆閿欒");
			return null;
		}


				

		
		
	
	
		
		
		
		

	}
}
