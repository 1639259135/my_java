package com.lanou3g.change;

public class Main {

	public static void main(String[] args) {
		
		//父类的引用指向了子类
		Father f = new Son();
		
//		f =new Girl();
		
		
		//父类的引用,只能找到父类的方法
		//找不到子类独有的方法
		f.show();
		
		
//		if(f instanceof Son){
		
			//如果f这个引用指向的对象为Son
			//那么我们可以进行强制类型转换
			Son son = (Son)f; //父类引用f强制转换成子类引用son
			son.play();		
			son.show();
//		}
		
		
		
	}

}
