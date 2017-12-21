import java.util.Scanner;

public class Task02 {
	public static void main(String[] args){
		
		
		//第一题
		System.out.println("****************");
		System.out.println("   ***   JAVA   ***");
		System.out.println("      ****************");
		
		
		System.out.println("-------------");
		//第二题
		int A = 189;
		int a = A / 100;
		int B = 189 % 100;
		int b = B / 50;
		int C = B % 50;
		int c = C / 20;
		int D = C % 20;
		int d = D / 10;
		int E = D % 10;
		int e = E / 5;
		int F = E % 5;
		int f = F ;
		System.out.println("100元的张数:" + a + "张");
		System.out.println("50元的张数:" + b + "张");
		System.out.println("20元的张数:" + c + "张");
		System.out.println("10元的张数:" + d + "张");
		System.out.println("5元的张数:" + e + "张");
		System.out.println("1元的张数:" + f + "张");
		
		
		System.out.println("-----------------");
		//第三题
		int integer = 111;
		if(integer % 2 == 0){
			System.out.println(integer + "是偶数");
		}else{
			System.out.println(integer + "是奇数");
		}
		
		
		System.out.println("------------------");
		//第四题
		int weight = 60;
		double money;
		if(weight <= 50){
			money = weight * 0.15;
			System.out.println("您的运费为:" + money + "元");
		}else{
			money =(weight - 50) * 0.25 + 7.5;
			System.out.println("您的运费为:" + money + "元");
		}
		
		
		System.out.println("---------------");
		//第五题
		int year = 1900;
		if(year % 4 ==0 & year % 100 != 0 || year % 400 == 0){
			System.out.println(year + "年是闰年");
		}else{
			System.out.println(year + "年不是闰年");
		}
		
		
		
		
		
	}

}
