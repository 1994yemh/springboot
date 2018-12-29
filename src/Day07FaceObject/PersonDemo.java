package Day07FaceObject;

class  PersonDemo {
	private int a=3;
	 static  int b=4;
	public static void main(String[] args) {
		//创建对象1
		Person p1 = new Person("邓丽君",16,"中国");
		p1.show();
		
		//创建对象2
		//Person p2 = new Person("杨幂",22,"中国");
		//p2.show();
		Person p2 = new Person("杨幂",22);
		p2.show();
		
		//创建对象3
		//Person p3 = new Person("凤姐",20,"中国");
		//p3.show();
		Person p3 = new Person("凤姐",20);
		p3.show();
		
		p3.country = "美国";
		p3.show();
		
		p1.show();
		p2.show();
		Person s = new Person();
		System.out.println(s.num);
		
		System.out.println(Person.num2);
		System.out.println(s.num2);
		
	}
	public static void test(){
		//int c=a;
		int n=b;
	}
}