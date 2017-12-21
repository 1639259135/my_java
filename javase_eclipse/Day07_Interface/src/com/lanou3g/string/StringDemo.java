package com.lanou3g.string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String a = "    abcdefg   ";
		
		
		//去除字符串前后的空格
//		a.trim();
		//并不会把a改变,只是返回结果值
		//所以我们将a的结果赋值给a
		a = a.trim();
		
		//获取字符串的长度
		System.out.println(a.length());
		
		//替换,把a替换成h
		//只是返回替换的结果,并不会把结果赋值给a
		System.out.println(a.replace('a', 'h'));
		
		//取字符串的子串
		//从0位置开始,取到1
		//这是一个左闭右开的区间,[0,2)
		//所以就是从0取到1
		System.out.println(a.substring(0, 2));
		
		//取字符串的子串
		//从4开始取到末尾
		System.out.println(a.substring(4));
		
		//分割字符串
		//以e为条件分割字符串
		//会得到一个字符串的数组
		System.out.println(Arrays.toString(a.split("e")));
		
		//判断两个字符串的内容是否相等
		System.out.println(a.equals("bcd"));
		
		//判断两个字符串的内容是否相等,忽略大小写
		a.equalsIgnoreCase("CB");
		
		//获取字符c 在a这个字符串中的位置
		//如果不存在c,则返回-1
		int index = a.indexOf('c');
		System.out.println(index);
		
		//获得index位置的字符
		//输入的index值一定要在字符串长度内
		//否则会报错
//		char ch = a.charAt(-2);
		char ch = a.charAt(2);
		System.out.println(ch);
		
		//是否以'a'开头
		a.startsWith("a");
		
		//是否以'a'结尾
		a.endsWith("a");
		
		//将字符串拼接到a后面
		a = a.concat("我是后连上的");
		
		//字符串是否包含"bcd",返回true或者false
		a.contains("bcd");
		
		//将字符串a中的小写字母都转换成大写
		a.toUpperCase();
		
		//将字符串a中的大写字母都转换成小写
		a.toLowerCase();
		
		//得到a字符串的字符数组
		char[] chs = a.toCharArray();
		int[] a1 = {1,2,3};
		System.out.println(chs);
		System.out.println(Arrays.toString(a1));
		
		//设计到编码转换的
		byte[] bytes = a.getBytes();
		String aa = new String(bytes,"utf-8");
		System.out.println(aa);
		
		
		
	}

}
