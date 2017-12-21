
public class Main {
	public static void main(String[] args){
		
		
		Car car = new Car();//这就是创建对象的过程
		
		//这里是将car的地址传给了c2
		Car c2 = car;
		c2.showInfo();
		//Car就是类,
		//car就是对象
		//是根据Car这个类创造出来的
		
		
		
//		car.showInfo();
		System.out.println(car == c2);
		

		/*
		Car d = new Car();创建对象的过程

		首先：Car d是放在栈里的，
		d叫做引用，通过引用可以找到
		对象。

		new Car();是放在堆里的，
		这个才是真正的对象。
		会先在堆中，开辟一块空间，
		将这个空间的内存地址，赋值
		给了栈中的Car d;这个引用


		所以d才可以根据内存地址，
		找到在堆中存储的对象。


		***
		所有通过new关键字创建的对象，
		都是存放在堆中的。

		Car dd = new Car();
		dd = d;

		本来dd是指向了堆中的，
		一个对象。
		执行了dd=d后，就把
		d的地址值给了dd

		这样dd和d就指向了
		同一个对象
		*/
		
		/*
		 * 属性初始化的顺序:
		 * 		默认初始化,显示初始化,构造代码块初始化,构造方法初始化
		 * 
		 */
		
		
		
		/*
		 * 建三个类：
				Father：
				属性：姓名，工资，年龄
				showInfo：展示三个属性
			
				Mother：
				属性：姓名，拿手菜，年龄
				showInfo：展示三个属性
			
				Child：
				属性：姓名，学校，对象的名字
			
				showInfo：展示三个属性

		 */
		Father a = new Father();
		a.showInfo();
		
		Mother A = new Mother();
		A.showInfo();
		
		Child b = new Child();
		b.showInfo();
		
		
		
	}

}
