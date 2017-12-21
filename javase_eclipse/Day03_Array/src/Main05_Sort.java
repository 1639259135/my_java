import java.util.Arrays;
import java.util.Scanner;

public class Main05_Sort {
	public static void main(String[] args){
		/*
		 * 创建一个数组用来接收五个同学的成绩,长度为5
		 */
		
		Scanner input = new Scanner(System.in);
		
		int[] scores = new int[5];
		/*for(int i = 0;i < scores.length;i ++){
			System.out.println("输入第" + i + "个同学的成绩:");
			scores[i] = input.nextInt();
		}
		对数组进行排序(小到大),固定写法
		Arrays.sort(scores);
		
		System.out.println(Arrays.toString(scores));
		
		冒泡排序,插入排序,选择排序
		*/
		
		
		//求数组中的最大数
		int max = 0;
		for(int i = 0;i < scores.length;i ++){
			System.out.println("输入第" + i + "个成绩:");
			int a = input.nextInt();
			scores[i] = a;
			if(a > max){
				max = a;
			}	
			System.out.println("最大值为:" + max);
		}
	
		
	
	}

}
