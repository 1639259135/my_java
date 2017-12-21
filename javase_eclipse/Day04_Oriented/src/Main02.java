
public class Main02 {
	
	//main就是程序的入口
	//当java程序运行时
	//就会先从这里开始执行
	public static void main(String[] args){
		/*
		 * 当你创建好类之后
		 * 需要先创建对象,才能使用
		 * 
		 */
		
		Father father = new Father();
		
		//使用对象,调用它的方法去做一些事情
		//格式: 对象名.方法名()
		father.showInfo ();
		
		//                  对象名.属性
		System.out.println(father.name);
		
		
		Student zhangSan = new Student();
		
		//对象名.属性名 = 属性值
		//这是一个赋值过程
		zhangSan.name = "老王";
		zhangSan.school = "蓝鸥科技欢迎你";
		
		System.out.println(zhangSan.name);
		
		
		//对象名调用方法
		//使用zhangSan这个对象
		//调用play这个方法
		zhangSan.play();
		
		
		zhangSan.buyFood(100);
		
		zhangSan.add(100,25);
		
		//这个方法是有返回值的
		//返回值的类型是String
		//所以我们定义一个String类型的变量去接收这个方法的返回值
		String f = zhangSan.hot("冷面");
		System.out.println(f);
		
		
	}

}
