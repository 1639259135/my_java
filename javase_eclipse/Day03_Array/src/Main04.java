import java.util.Arrays;
import java.util.Scanner;

public class Main04 {
	public static void main(String[] args){
		
		int[] scores = {98,99,94,96,87,56};
		/*
		 * scores就是标识符,是这个数组的名字
		 * int表示这个数组可以装载的类型
		 * int[]表示这个数组的类型
		 * 
		 * {}中就是数组的内容
		 * 98:数组中的元素,就是数组的内容		
		 * 下标:
		 * 		元素在数组中的位置
		 * 		从0开始计数  
		 * 数组中最后一个元素的下标:
		 * 			数组长度减一	
		 */	 
		
		//取出数组中下标为0的元素
		//赋值给一个变量b
		int b = scores[0];
		//int b = 98;
		
		System.out.println(b);
		
		//创建数组的第二种方式
		//死记硬背记住就行
		//创建一个长度为3的数组
		int[] d = new int[3];
		Scanner input = new Scanner(System.in);
		//d.length:可以获取数组d的长度
		for(int i = 0;i < d.length;i ++){
			//接收输入进来的值
			//将其赋值给r
			//int r = input.nextInt();
			
			//把r的值赋给数组中第i位置的元素
			//d[i] = r;
			
			System.out.println("请录入第" + i + "个成绩:");
			d[i] = input.nextInt();
		}
		
		//固定写法,可以直接输出d的内容
		System.out.println(Arrays.toString(d));
		
		
		
		
		//插入排序
		// 这里初始化数组
		int [] array = {8,9,6,0,7,5,3,1,4,2};
		
		for(int i = 1;i<array.length;++i){
			if(array[i] < array[i - 1]){
				int temp = array[i];
				//把角标保存到m变量上
				//这样操作变量变化的时候不会影响外层循环的变量i
				int m = i;
				for(int j = m - 1; j >= 0 && array[j] > temp;j --){
					array[j + 1] = array[j];
					m --;
				}
				array[m] = temp;
			}
		}
		System.out.println(Arrays.toString(array));

		
		
		//选择排序
		int[ ] array1 = {3,6,2,4,8,7,5};
		for(int i = 0; i<array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[ i ] > array[ j ]) {
					int  temp = array[ j ];
					array[ j ] = array[ i ] ;
					array[ i ] = temp;
				}
			}
		System.out.println(array[ i]);
		}

		
		
		
		
	}

}
