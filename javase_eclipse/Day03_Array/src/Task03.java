
public class Task03 {
	public static void main(String[] args){
		
		//打印三位数水仙数
		for(int i =1;i < 10;i ++){
			for(int j = 0;j < 10;j ++){
				for(int k = 0;k < 10;k ++){
					if(i * i * i + j * j * j + k * k * k == i * 100 + j * 10 + k ){
						System.out.println(i * 100 + j * 10 + k);
					}
				}
			}
		}

		
		//求数组中元素的最大值,最小值,平均值及元素之和
		int[] A = {10,20,30,40,50};
		int sum = 0;
		int min = A[1];
		int max = A[1];
		for(int i = 0;i < A.length;i ++){
			sum += A[i];
			if(A[i] > max){
				max = A[i];
			}else if(A[i] < min){
				min =A[i];
			}
		}
		System.out.println("数组中的最大值为:" + max);
		System.out.println("数组中的最小值为:" + min);
		System.out.println("数组中元素的和为:" + sum);
		System.out.println("数组中的元素平均值为:" + sum / A.length);
		
	
		
		/*
		 * 打印:
		 *         *
		 *       * * *
		 *     * * * * *
		 *   * * * * * * *
		 */
		for(int i = 0;i < 0;i ++){
			for(int j = 0;j < (4 - i);j ++){
				System.out.print(" ");
			}
			for(int k = 0;k < (i * 2 + 1);k ++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		/*
		 * 打印:共19行
		 *         *
		 *       * * *
		 *     * * * * *
		 *   * * * * * * *
		 *       .....
		 *   * * * * * * *
		 *     * * * * *  
		 *       * * *  
		 *         *      
		 */
		for(int i = 0;i < 19;i++){
			if(i < 10){
				for(int j = 0;j < (9 - i);j ++){
					System.out.print(" ");
				}
				for(int k = 0;k < (i * 2 + 1);k ++){
					System.out.print("*");
				}
				System.out.println();
			}else{
				for(int j = 0;j < (i - 9) ;j ++){
					System.out.print(" ");
				}
				for(int k = 0;k < (17 - (i - 10) * 2);k ++){
					System.out.print("*");
				}
				System.out.println();
			}
		}

		
	}

}
