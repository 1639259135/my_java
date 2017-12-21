package com.lanou3g.normal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarDemo {
	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println(date);
		
		System.out.println(new CalendarDemo());
		
		
		System.out.println(System.currentTimeMillis());
		long l = System.currentTimeMillis();
		
		//这个可以帮助我们将毫秒时间转换成我们能看懂的字符串
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String time = df.format(l);
		System.out.println(time);
		
		
				
	}

//	@Override
//	public String toString() {
//		return "我调用了这个类的toString方法";
//	}
	
	

}
