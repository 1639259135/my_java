package com.lanou3g.normal;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		
		//取一个随机数
		//需要用到Random这个工具类
		Random random = new Random();
		
		int r = random.nextInt();
		System.out.println(r);
		
		//1,取一个0-10之间的随机数
		//nextInt(bound)接受的参数
		//是一个左闭右开的区间[0,bound)
		int e = random.nextInt(11);
		System.out.println(e);

		//2,取一个30-45之间的随机数
		//公式:(最大值减最小值+1)外面再加上最小值
		e = random.nextInt(45 - 30 + 1) + 30;
		System.out.println(e);
		
		//3,随机取一个true或false
		boolean b = random.nextBoolean();
		System.out.println(b);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
