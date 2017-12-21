import java.util.Scanner;

public class Main2 {
	public static void main(String[] args){
		
		//System.out.println("1");
		/*
		 * while循环
		 * 	先判断括号中的内容,是否为true
		 *  	 如果为true,则执行大括号里面的内容
		 * 	然后再判断括号里面的内容是否为true
		 *  	 如果...一遍遍
		 *   当括号中的内容为false时
		 *  	while循环结束
		 */
		
		
		int i = 51;
		while(i < 50){
			//小括号里面的内容叫循环条件
			//大括号里面的内容叫循环体
			System.out.println(i);
			
			//循环增量
			//    为了跳出循环,防止出现死循环
			//i = i + 1
			//i++;或++i;都行
			i = i * 7; 
			//可以简写为:i* = 7		
		}
		
		
		int progress = 1;
		do{
			//System.out.println(progress);
			progress+= 2;
		}while(progress < 10);
		
		/*
		 * do-while于while的区别
		 *   do-while是先执行一次循环体,然后再判断
		 * 
		 *   while是先判断再执行循环体
		 */
		
		
		int times = 0;
		do{
			//System.out.println("好好学习,天天向上");
			times++;
		}while(times > 100);
		
		
		/*int = 0;设置初始条件
		  k < 100;循环条件
		  k++;循环增量
		  {}中的内容:循环体
		*/
		for(int k = 100;k < 100;k++){
			System.out.println("好好学习,天天向上");
		}
		
		
		/*
		  for(;;){
			
		  }
		等同于
		  while(true){
		  
		  }
		*/
		
		int f = 0;
		for(;f < 10;f++){
			
		}
		
		
		for(;f < 10;f+= 5){
			
		}
		
		
		
		//固定格式,就是一个工具
		//Scanner input = new Scanner(System.in);
		//下面这句话,会得到控制台输入的内容
		//我们建立一个变量去接收得到的内容
		//阻塞式
		//String c = input.nextLine();
		
		//System.out.println("我们得到了:" + c);
		
		
		//单词:import/Scanner/Console/Debug
		
		System.out.println("请输入五科成绩:");
		Scanner input = new Scanner(System.in);
		int sum = 0;
		for(int a = 1;a <= 5;a++){
			System.out.println("第" + a + "门成绩:");
			int score = input.nextInt();
			System.out.println(score);
			sum+= score;
		}
		int averageScore = sum / 5;
		System.out.println("平均成绩为:" + averageScore);
		
		
	}
}
