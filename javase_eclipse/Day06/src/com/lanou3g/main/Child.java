package com.lanou3g.main;

public class Child {
	private String name;
	
	private Father father;
	private Mother mother;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setFather(Father father){
		this.father = father;
	}
	public void setMother(Mother mother){
		this.mother = mother;
	}
	
	public void showFamily(){
		System.out.println(name + "的爸爸是" + father.getName() + ",妈妈是" + mother.getName());
	}
	
	
}
