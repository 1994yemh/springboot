package Day07FaceObject;

public class StudentDemo {
	public static void main(String[] args) {
		//创建学生对象
		Student s = new Student();
		System.out.println(s);
		s.show();
		System.out.println("--------------");
		
		//给成员变量赋值
		s.nameq = "林青霞";
		//s.age = 27;
		s.setAge(27);
		s.show();
		System.out.println("--------------");
		
		//给age赋值
		//s.age = -27; //这个数据是不合理的
		//通过方法给值
		s.setAge(-27);
		s.show();
		System.out.println("--------------");
	}
}