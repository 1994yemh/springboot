package Day19ExceptionIo;

/*
 * throw:如果出现了异常情况，我们可以把该异常抛出，这个时候的抛出的应该是异常的对象。
 * 
 * throws和throw的区别(面试题)
	throws
		用在方法声明后面，跟的是异常类名
		可以跟多个异常类名，用逗号隔开
		表示抛出异常，由该方法的调用者来处理
		throws表示出现异常的一种可能性，并不一定会发生这些异常
	throw
		用在方法体内，跟的是异常对象名
		只能抛出一个异常对象名
		表示抛出异常，由方法体内的语句处理
		throw则是抛出了异常，执行throw则一定抛出了某种异常
 */
public class ExceptionDemo {
	public static void main(String[] args) throws Exception {
		// method();
		getInt();
		try {
			method2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void method() {
		int a = 10;
		int b = 0;
		if (b == 0) {
			throw new ArithmeticException();
		} else {
			System.out.println(a / b);
		}
	}

	public static void method2() throws Exception {
		int a = 10;
		int b = 0;
		if (b == 0) {
			throw new Exception();
		} else {
			System.out.println(a / b);
		}
	}
	@SuppressWarnings("finally")
	public static void getInt() throws Exception  {
		int a = 10;
		try {
			//System.out.println(a / 0);
			if(a==10){
				
				throw new Exception("分数必须在0-100之间");
			}
			//a = 20;
		} catch (ArithmeticException e) {
			//a = 30;
			//return a;
			/*
			 * return a在程序执行到这一步的时候，这里不是return a而是return 30;这个返回路径就形成了。
			 * 但是呢，它发现后面还有finally，所以继续执行finally的内容，a=40
			 * 再次回到以前的返回路径，继续走return 30;
			 */
		} finally {
			a = 10;
			//return a;//如果这样结果就是40了。
		}
		// return a;
	}
}
