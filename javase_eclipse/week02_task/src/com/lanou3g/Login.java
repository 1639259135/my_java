package com.lanou3g;

public class Login {
	private UserInter ui;
	UserData ud = new UserData();
	
	public UserInter getUi() {
		return ui;
	}
	public void setUi(UserInter ui) {
		this.ui = ui;
	}

	public UserData getUd() {
		return ud;
	}

	public void setUd(UserData ud) {
		this.ud = ud;
	}

	public void login(String userName, String password){
		for(int i = 0; i < ud.getUd().length; i ++) {
			String name = UserData.ud.getUd()[i][0];
//			String userName = UserData.ud.getUd()[i][1];
//			String password = UserData.ud.getUd()[i][2];
			Strign profession = UserData.ud.getUd()[i][3];

			if (userName.equals(ud.getUd()[i][1]) && password.equals(ud.getUd()[i][2])) {
				System.out.println("姓名:" + ud.getUd()[i][0] + "\t" + "职业:" + ud.getUd()[i][3]);

				switch (profession) {
					case "Worker":
						return new Worker(name,userName, password, profession);
					case "Doctor":
						return new Doctor(name,userName, password, profession);
					case "Cooker":
						return new Cooker(name,userName, password, profession);
					case "Boss":
						return new Boss(name,userName, password, profession);
				}
			}
			System.out.println("输入错误");
			return null;
		}


				

		
		
	
	
		
		
		
		

	}
}
