package Day10面向对象;

/*
	形式参数：
		基本类型(太简单，不是我今天要讲解的)
		引用类型
			类名:(匿名对象的时候其实我们已经讲过了)需要的是该类的对象
			抽象类:需要的是该抽象的类子类对象
			接口
*/
 class Person {
	public void study(){};
}

class PersonDemo1 {
	public void method(Person p) {//p; p = new Student();  Person p = new Student(); //多态
		p.study();
	}
}

//定义一个具体的学生类
class Student extends Person {
	public void study() {
		System.out.println("Good Good Study,Day Day Up");
	}
}

class PersonTest {
	public static void main(String[] args) {
		//目前是没有办法的使用的
		//因为抽象类没有对应的具体类
		//那么，我们就应该先定义一个具体类
		//需求：我要使用PersonDemo类中的method()方法
		PersonDemo1 pd = new PersonDemo1();
		Person p = new Student();
		p.study();
		pd.method(p);
	}
}