package com.lanou3g;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("账号:");
		String userName = input.nextLine();
		System.out.println("密码:");
		String password = input.nextLine();

		UserInter ui = new Login().login(userName,passworsd);

		if (ui != null) {
			Person person = (Person) ui;

			long L = System.currentTimeMillis();
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			String T = df.format(L);
			System.out.println("当前时间:" + T);

			System.out.println("是否开始工作: 1,是 \t 2, 否");
			String result = input.nextLine();
			if (result.equals(1)) {
				ui.onLine();
			} else if (result.equals(2)) {
				ui.offLine();
			} else {
				System.out.println("来干嘛的呀?回去吧");
			}
		}
	}
}
