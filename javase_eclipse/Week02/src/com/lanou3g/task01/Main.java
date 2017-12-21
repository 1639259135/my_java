package com.lanou3g.task01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Login user = new Login();
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("账号:");
		user.setUserName(input.nextLine());
		System.out.println("密码:");
		user.setPassword(input.nextLine());
		
	}

}
