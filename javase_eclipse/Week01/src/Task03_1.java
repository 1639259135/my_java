import java.util.Scanner;

public class Task03_1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//打印正方形和对角线
		System.out.println("请输入打印边长:");
		int L =input.nextInt();
		for(int num = 0;num < L;num ++){
			if(num == 0 || num == L - 1){  //打印第一行和最后一行
				for(int i = 0;i < L;i ++){
				System.out.print("*");
				}
				System.out.println();  //换行
			}else{
				System.out.print("*");
				if(num < L / 2){  //打印上半部分
					for(int i = 0;i < num - 1;i ++){  //打印最左边空格
						System.out.print(" ");
					}
					System.out.print("*");
					for(int j = 0;j < L - 4 - (num - 1) * 2;j ++){	//打印中间空格
						System.out.print(" ");
					}
					System.out.print("*");	
					for(int i = 0;i < num - 1;i ++){  //打印最右边空格
						System.out.print(" ");
					}	
					System.out.print("*");	
					System.out.println();	//换行				
			    }else if(num == L / 2){	 //打印中心一行
					for(int i = 0;i < L / 2 - 1;i ++){	//打印左边空格
						System.out.print(" ");
					}
					System.out.print("*");
					for(int i = 0;i < L / 2 - 1;i ++){	 //打印右边空格
						System.out.print(" ");
					}
					System.out.print("*");
					System.out.println();	//换行	
				}else{			//打印下半部分
					for(int i = 0;i < L / 2-(num - L / 2) - 1;i ++){
						System.out.print(" ");	 //打印最左边空格
					}
					System.out.print("*");
					for(int j = 0;j < (num - L / 2) * 2 - 1 ;j ++){		//打印中间空格
						System.out.print(" ");
					}
					System.out.print("*");
					for(int i = 0;i < L / 2-(num - L / 2) - 1;i ++){	//打印最右边空格
						System.out.print(" ");
					}
					System.out.print("*");
					System.out.println();	//换行
				}
				
			}
			
		}
		
		
		
		int account = 8888;
		int password = 6666;
		System.out.println("请输入账号:");
		int newAccount = input.nextInt();
		while(newAccount != account){
			
			System.out.println("账号不存在,请重新输入:");
			newAccount = input.nextInt();
		}
		System.out.println("请输入密码:");
		int newPassword = input.nextInt();
		while(newPassword != password){
			System.out.println("密码错误,请重新输入:");
			newPassword = input.nextInt();
		}
		System.out.println("欢迎用户" + account + "登录系统");
			
		
	}

}
