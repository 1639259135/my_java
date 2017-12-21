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
				System.out.println("请输入第" + (j + 1) + "个数:");
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
		
	}

}
