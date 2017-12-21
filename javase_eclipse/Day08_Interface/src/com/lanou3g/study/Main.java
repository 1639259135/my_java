package com.lanou3g.study;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//父类的引用,指向子类的对象
		//这就是多态的一部分
		Person person = new Teacher();
		Person p2 = new Doctor();
		Person s = new Student();
		
		Scanner input = new Scanner(System.in);
		System.out.println( "输入1,老师干活,输入2,老师讲课,输入3,学生上课");
		
		//获取控制台输入的整数值
		//这个方法有阻塞,当执行这个方法时,如果控制台一直不输入内容,程序就会卡在这里离
		int choice = input.nextInt();
		
		
		Company2 company2 = new Company2();
		
		if(choice == 1){
			Teacher t = new Teacher();
			company2.setPerson(person);
		}else if(choice == 2){
			Doctor d = new Doctor();
			company2.setPerson(d);
		}else if(choice == 3){
			company2.setPerson(s);
		}	
		company2.work();
		
		
		
		
		
		
		
	}
	
}
