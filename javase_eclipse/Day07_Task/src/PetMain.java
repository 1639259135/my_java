import java.util.Scanner;

public class PetMain {
	public static void main(String[] args) {
		Pet dog = new Pet();
		Pet penguin = new Pet();
		Scanner input = new Scanner(System.in);
		
		System.out.println("欢迎来到宠物之家!");
		System.out.println("请给你要来领养的宠物去一个好听的名字吧!");
		Pet.name = input.nextLine();
		System.out.println("你想要领养一个什么宠物呢?	1,狗狗	2,企鹅");
		Pet.kind = input.nextLine();
		
		
		
	}

}
