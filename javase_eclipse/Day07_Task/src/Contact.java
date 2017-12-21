
public class Contact {
	private String name;
	private String sex;
	private String num;
	private String place;
	private String group;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
	public void showMessage(String name, String num){
		System.out.println(name + ":" + num);
		
	}
	

}
