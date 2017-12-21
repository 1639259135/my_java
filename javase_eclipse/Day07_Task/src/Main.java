import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[] nameList = new String[10];
		String[] numList = new String[10];
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < nameList.length; i ++){
			System.out.println("联系人" + i + ":" + "姓名:");
			nameList[i] = input.nextLine();	
			
			System.out.println("num:");
			numList[i] = input.nextLine();
			
			if(nameList == null || numList == null){
				System.out.println("添加失败");
			}else{
				System.out.println("添加成功");
			}
			
			
			
			
			
			
			
			
			
		}
		
		
		
	}

}
