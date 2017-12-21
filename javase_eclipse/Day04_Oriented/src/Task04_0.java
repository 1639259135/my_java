
public class Task04_0 {
//	创建四个类:
//	快递员
//	售货员
//	学生
//	教师
//	
//	要求:
//	每个类四个属性
//	一个不带参数不带返回值的方法
//	一个不带参数带返回值的方法
//	一个带参数不带返回值的方法
//	一个带参数带返回值的方法
	
	
	//快递员
	static void Courier(){
		String name = "快递小哥";
		String race = "黄种人";
		int age = 18;
		String place = "金融港";
	}	
	public void show(){
		
	}
	
	public String take(){
		return "去取快递";
	}

	public void receive(String expressAge){
		
	}

	public String express(String expressAge){
		return "送快递";
	}
	
	
	
	//售货员
	static void Salesclerk(){
		String name = "售货员阿姨";
		String sex = "女";
		int age = 45;
		double money = 10000000;
	}
	public void sell(){
		
	}
	
	public String toMoney(){
		return "收了多少钱";
	}
	
	public void deliver(String commodity){
		
	}
	
	public String clear(String commodity){
		return "整理商品";
	}
	
	
	
	//学生
	static void Student(){
		String name = "张三";
		String sex = "女";
		String id = "00001";
		int height = 50;
	}
	
	public void study(){
		
	}
	
	public String play(){
		return "吃鸡";
	}
	
	public void goHome(String time){
		
	}

	public String goToSchool(String time){
		return "和谁一起上学";
	}
	

	
	//教师
	static void Teacher(){
		String name = "老胡";
		String like = "喝酒";
		int height = 168;
		String moral = "差";
	}
	
	//上课
	public void attend(){
		
	}
	
	//玩
	public String pay(){
		return 1.9 + "小时";
	}
	
	public void goTowork(int time){
		
	}
	
	public int teach(int time){
		return 9;
	}
	
	
	
	
	
}
