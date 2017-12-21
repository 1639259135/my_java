package com.lanou3g.study;

public class Company2 {
	/*
	 * 当我声明一个父类引用的时候
	 * 你给我一个父类的对象
	 * 或者子类的对象都行
	 */
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		person = person;
	}
	
	public void work(){
		
		//如果person这个引用指向的对象
		//是Teacher类型的,那么表达结果为true
		if(person instanceof Teacher){
			System.out.println("是一个老师");
		}
		if(person instanceof Student){
			System.out.println("四一个学生");
		}
		person.work();
		
		
		
		
	}
	
}
