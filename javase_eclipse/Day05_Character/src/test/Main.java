package test;

public class Main {
	public static void main(String[] args) {
		Student s = new Student();
		Student stu = new Student();
		
//		s.name = "张三";
		//通过getName方法
		//拿到s对象的name属性
		String name = s.getName();
		System.out.println(name);
		
	
		name = stu.getName();
		System.out.println("前:" + name);
		
		
		//当执行setName方法时,将这个字符串传给了参数列表中的参数n
		stu.setName("她师妹");
		
		
		name = stu.getName();
		System.out.println("后:" + name);
		
		
//		
		//得到sad方法执行的结果
		//把这个结果赋值给result这个变量
		String result = s.sad();
		//输出
		System.out.println(result);
		
	}

}
