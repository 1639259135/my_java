package com.lanou3g.二维数组;

import java.util.Scanner;

public class Arrat2 {
	public static void main(String[] args){
		String[][] us = new String[3][4];
//		System.out.println(us.length);
//		System.out.println(us[0].length);
		
		Scanner input = new Scanner(System.in);
		
		String [] [] arr = new String [4][5];
		for(int i =0;i<arr.length;i++){
			for (int j = 0; j < arr[i].length; j++) {
//				System.out.println("请输入第" + i + (j + 1) + "位置1数:");
				arr[i][j] = input.nextLine();
			}
		}
		
		//打印二维数组
//		for(int i =0;i<arr.length;i++){
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(" "+arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
		String[][] ud = new String[4][4];
		for(int i = 0; i < ud.length; i ++){
			for(int j = 0; j < ud[0].length; j ++){
				if(j == 0){
					System.out.println("姓名" + i + ":");
				}else if(j == 1){
					System.out.println("用户名" + i + ":");
				}else if(j == 2){
					System.out.println("密码" + i + ":");
				}else{
					System.out.println("职业" + i + ":");
				}
				ud[i][j] = input.nextLine();
			}
		}
	
		
		
		
		
		
		
		
		
		
	}

}
