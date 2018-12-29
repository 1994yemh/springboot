package Day10面向对象;

 abstract class PersonDemo {
    private int age;
    private int name;
	public PersonDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonDemo(int age, int name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	 public  void Go(){
		 System.out.println("要出国");
		 
	 }
    public abstract void Communication();
}

 class Player extends PersonDemo{

	@Override
	public void Communication() {
		// TODO Auto-generated method stub
		System.out.println("运动员要学习外语");
	}
	
	
}