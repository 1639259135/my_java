package com.lanou3g;

public class UserData {
	private String[][] ud = new String[][]{
		{"张三","zhangsan","111111","Worker"},
		{"李四","lisi666","222222","Doctor"},
		{"王五","wangwu888","333333","Cooker"},
		{"赵六","zhaoliu999","444444","Boss"}
	};

	
	public String[][] getUd() {
		return ud;
	}

	public void setUd(String[][] ud) {
		this.ud = ud;
	}
	
	
}
