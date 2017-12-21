
public class Main {
	public static void main(String[] args){
		
		//定义一个变量代表你的java成绩
		int javaScore = 90;
		if(javaScore > 90){
			System.out.println("成绩优秀");
		}
		
		
		if (javaScore > 700){
			System.out.println("厉害了厉害了");
		}else{
			System.out.println("不好意思,再多学学");
		}
		
		
		//当要执行的语句只有一条时
		//if语句后面可以不写{}
		if (javaScore < 60)
			System.out.println("gg了兄弟,拉倒吧");
		
		
		//当成绩大于80并且小于100的时候
		//会进入{}中执行语句
		//同时成立则执行
		
		//&&: 当左侧判断条件不成立时,不会判断右侧条件
		//&:  当左侧判断条件不成立时,依然会判断右侧条件
		if(javaScore > 80 && javaScore < 100 ){
		
			System.out.println("这就比较厉害了");
		}
		System.out.println(javaScore);
		
		//       ||和|
		
		
		if(javaScore > 60 || javaScore < 90){
			//左右表达式只要有一个为true,if结果为true
		}
		// ||和|的区别
		// ||:如果左侧为true,不判断右侧
		// | :不管左侧是什么都判断右侧
		
		
		// !:非     !true = false ; !false = true
		if(!(javaScore < 60)){
			System.out.println("说明>=60");
		}
		
		
		//如何交换两个变量的值:
		int a = 10;//包子
		int b = 20;//馒头
		//第一种方法
		//1,定义一个新的变量c
		//2,将a的值赋给c
		//3,将b的值赋给a
		//4,将 c的值赋给b
		
		//把包子给c
		int c = a;
		//把馒头给a
		a = b;
		//把包子给b
		b = c;
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		
		//第二种方法
		//不使用第三方变量,直接使用加减法运算
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		
		//第三种方法
		//不使用第三方变量,使用异或^
		//一个数异或另一个人数两次,结果还是这个数
		//      5^6^6 == 5
		System.out.println(1 ^ 1);
		System.out.println(0 ^ 1);
		System.out.println(1 ^ 0);
		System.out.println(0 ^ 0);
		/*
		 * |操作二进制
		 * 有一个1 结果为1
		 * 
		 * ^操作二进制
		 * 两者不等则为1,相等则为0
		 *    就是不同时为1或0
		 */
		 a = a ^ b;
		 b = a ^ b;
		 a = a ^ b;
		 System.out.println("a:" + a);
		 System.out.println("b:" + b);
		
		 
		 int score = 90;
		 if(score >= 80){
			 System.out.println("良好");	
		 }else if(score >= 60){
			 System.out.println("中等"); 
		 }else{
			 System.out.println("差");
		 }
		
		 
		 //1秒跑15米
		 int speed = 15;
		 //0表示女,1表示男
		 int gender = 3;
		 if(speed > 10){
			 //说明跑100米用不上10秒
			 System.out.println("进决赛");
			 if(gender == 1){
				 System.out.println("进男子组");	 
			 }else if(gender == 0){
				 System.out.println("进女子组");
			 }else{
				 System.out.println("人妖太猛了,pass");
			 }
		 }
		 

		int ranking = 1;
		if(ranking == 1){
			System.out.println("参加夏令营");
		}else if(ranking == 2){
			System.out.println("笔记本一部");
		}else if(ranking == 3){
			System.out.println("移动磁盘一个");
		}else{
			System.out.println("Nothing");
		}
			
		
		int n = 4;
		switch(n){
		case 2 :
			//如果switch后面的括号中的内容等于2的话,那么就执行下面这行语句
			System.out.println("没错,就是2");
			break;
		case 3 :
			System.out.println("没错,就是3");
			break;
		default:
			System.out.println("我是默认值");
			break;
				
		}
		
		
		int num = 4;
		switch(num){
		case 1 :
			System.out.println("参加夏令营");
			break;
		case 2 :
			System.out.println("笔记本一台");
			break;
		case 3 :
			System.out.println("硬盘一个");
			break;
		default :
			System.out.println("Nothing");
		}
		
		
		//也支持字符型
		char ch = 'a';
		switch(ch){
		case 'a' :
			break;
		case 'b' :
			break;
		}

		
	}
	
	
}
