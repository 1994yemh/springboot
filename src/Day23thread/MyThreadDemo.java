package Day23thread;
/*
 *	进程：
 *		正在运行的程序，是系统进行资源分配和调用的独立单位。
 *		每一个进程都有它自己的内存空间和系统资源。
 *	线程：
 *		是进程中的单个顺序控制流，是一条执行路径
 *		一个进程如果只有一条执行路径，则称为单线程程序。
 *		一个进程如果有多条执行路径，则称为多线程程序。
 *
 *  举例：
 *  	扫雷程序，迅雷下载
 *  
 *  大家注意两个词汇的区别：并行和并发。
 *		前者是逻辑上同时发生，指在某一个时间内同时运行多个程序。
 *		后者是物理上同时发生，指在某一个时间点同时运行多个程序。
 *
 * Java程序的运行原理：
 * 		由java命令启动JVM，JVM启动就相当于启动了一个进程。
 * 		接着有该进程创建了一个主线程去调用main方法。
 * 
 * 思考题：
 * 		jvm虚拟机的启动是单线程的还是多线程的?
 * 			多线程的。
 * 			原因是垃圾回收线程也要先启动，否则很容易会出现内存溢出。
 * 			现在的垃圾回收线程加上前面的主线程，最低启动了两个线程，所以，jvm的启动其实是多线程的。
 */
/*
 * 该类要重写run()方法,为什么呢?
 * 不是类中的所有代码都需要被线程执行的。
 * 而这个时候，为了区分哪些代码能够被线程执行，java提供了Thread类中的run()用来包含那些被线程执行的代码。
 */
public class MyThreadDemo extends Thread   {
	 public MyThreadDemo(String name){

	      super(name);

	   }
	public static void main(String[] args) {
		System.out.println("hello");
		new Object();
		new Object();
		new Object();
		new Object();
		//...
		System.out.println("world");
		MyThreadDemo my=new MyThreadDemo("叶茂华");
		my.run();
		MyThreadDemo my1 = new MyThreadDemo("qwe");
		//my.setName("叶茂华");
		
		my1.start();
		my.start();
	}
	@Override
	public void run() {
		// 自己写代码
		// System.out.println("好好学习，天天向上");
		// 一般来说，被线程执行的代码肯定是比较耗时的。所以我们用循环改进
		for (int x = 0; x < 2; x++) {
			System.out.println(getName()+":"+x);
		}
		
	}
}
