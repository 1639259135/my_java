
public class Father {
	private double money;
	private String estate;
	
	
	public void invest(){
		System.out.println("先去投资个30亿");
	}
	public void travel(){
		System.out.println("去环游世界吧");
	}

	
	public Father(double money){
		 this.money = money;
		 System.out.println("又赚了" + money + "亿");
	}
	
	
}
