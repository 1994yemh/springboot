package Day07FaceObject;

public class Student {
	private String name;
    private int age;
     //姓名
    String nameq;
    //年龄
    private int age2;
  		
	public Student (){
		System.out.println("这是一个student的构造方法！");
	}
	//构造方法的重载格式
		public Student(String name) {
			System.out.println("这是带一个String类型的构造方法");
			this.name = name;
		}
		
		public Student(int age) {
			System.out.println("这是带一个int类型的构造方法");
			this.age = age;
		}
		
		public Student(String name,int age) {
			System.out.println("这是一个带多个参数的构造方法");
			this.name = name;
			this.age = age;
		}
		
		public void show() {
			System.out.println(name+"---"+age);}
	
		//写一个方法对数据进行校验
		/*
			返回值类型：void
			参数列表：int a
		*/
		public void setAge(int a) {
			if(a < 0 || age2 > 120) {
				System.out.println("你给的年龄有问题");
			}else {
				age2 = a;
			}
		}
		
		
		//show()方法,显示所有成员变量值
		public void show1() {
			System.out.println("姓名："+nameq);
			System.out.println("年龄："+age2);
		}
}
