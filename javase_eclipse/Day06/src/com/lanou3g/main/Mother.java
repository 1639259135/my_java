package com.lanou3g.main;

public class Mother {
	private String name;
	
	private Father husband;
	private Child child;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHusband(Father husband){
		this.husband = husband;
	}
	
	public void setChild(Child child){
		this.child = child;
	}
	
	public void showFamily(){
		System.out.println(name+ "的丈夫是" + husband.getName() + ",孩子是" + child.getName());
	}
	
	
	
}
