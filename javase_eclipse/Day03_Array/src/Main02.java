import java.util.Scanner;

public class Main02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		/*
		 * 有四个班级,每个班级有5名同学
		 * 所以每个班级都需要循环一次
		 *      在这个班级循环中
		 *      	再循环接收每个同学的成绩
		 */
		
		//第一层循环,每层循环表示一个班级
		for(int i = 1;i < 5;i++){
			//第二次循环,每次循环表示接收一个同学的成绩
			
			//用于储存班级成绩的变量
			int classScore = 0;
			for(int j = 1;j < 6;j++){
				//每当两层循环都执行完毕时
				//下面的语句执行了多少次?  20
				System.out.println("请输入第" + i + "班的第" + j +"位同学的成绩:");
				int score = input.nextInt();
				
				//怎样把接收到的成绩保存起来,用于求班级平均分?
				classScore = classScore + score;
			}
			System.out.println("第" + i + "班的平均分为:" + (classScore / 5));
		}
		
		
		//打印99乘法表
		for(int i = 1;i <= 9;i ++){
			for(int j = 1;j <= i;j++){
				System.out.print(j + "*" + i + "=" + j*i + " ");	
			}
			System.out.println();
		}
		
	}

}
