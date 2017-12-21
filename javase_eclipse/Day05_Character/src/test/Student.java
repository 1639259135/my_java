package test;

public class Student {
	
	//封装
	private String name = "天山童姥";
		
	//暴露出一个公共的方法去获得
	public String getName(){
		return name;
	}
	
	//暴露出一个公共的方法去设置
	public void setName(String n){
		name = n;
	}
	
	
	public void smile(){
		System.out.println("心里是乐开了花");	
	}
	
	private void cry(){
		System.out.println("哭的像个小可爱");
	}
	
	protected void angry(){
		System.out.println("气的像一只dog");
	}
	
	String sad(){
		return "爱是一道光";
	}
	

}
