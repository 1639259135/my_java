
public class Student {
	
	
	//这三个都叫属性
	//现在这三个属性都还没值
	String name;
	String school;
	int id;
	
	public void play() {
		System.out.println(name + "玩游戏去了");	
	}
	
	public void goToSchool() {
		System.out.println(name + "去上学了,学校是:" + school);
	}	
		
		
	
	/*
	 * public 权限修饰符
	 * 
	 * void 返回值类型
	 * 		void 表示  没有返回值
	 * 
	 * show 方法名(类似参数名)
	 * 
	 * (String str) 参数列表      是可以有多个参数的
	 * 				  String 是参数的类型
	 * 				  str 是参数的名字    是任意的,想怎么写就怎么写,但要见名知义
	 * 			调用方法时,需要传入对应类型的内容
	 * 
	 * {} 方法体:
	 * 		当这个方法被调用时,要执行的代码
	 */
	public void show(String str){
		
	}
	
	
	public void buyFood(int money){
		System.out.println(name + "拿着老师的钱" + money + "元打游戏去了");	
	}
	
	
	//让这个学生具备加法运算的能力
	public void add(int a,int b){
		int sum = a + b;
		System.out.println("和为:" + sum);
	}
	
	//public后面的String 表示	
	//		返回值的类型是String,是字符串
	public String hot(String food){
		return "已经加热了" + food;
	}
	
	
	
	
	
	
}
