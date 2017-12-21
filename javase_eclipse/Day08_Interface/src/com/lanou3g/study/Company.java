package com.lanou3g.study;

public class Company {
	private Teacher t;
	private Doctor d;
	
	
	public Teacher getT() {
		return t;
	}
	public void setT(Teacher t) {
		this.t = t;
	}
	
	public Doctor getD() {
		return d;
	}
	public void setD(Doctor d) {
		this.d = d;
	}
	
	
	public void work(){
		if(d != null){
			d.work();
		}
		if(t != null){
			t.work();	
		}
	}

	
	
	
	
	
	
	
	
	
	
	
}
