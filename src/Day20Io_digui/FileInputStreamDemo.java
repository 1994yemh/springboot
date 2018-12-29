package Day20Io_digui;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

/*
 * 字节输入流操作步骤：
 * A:创建字节输入流对象
 * B:调用read()方法读取数据，并把数据显示在控制台
 * C:释放资源
 * 
 * 读取数据的方式：
 * A:int read():一次读取一个字节
 * B:int read(byte[] b):一次读取一个字节数组
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		// FileInputStream(String name)
		// FileInputStream fis = new FileInputStream("fis.txt");
		FileInputStream fis = new FileInputStream("G:\\aaa\\bbb.txt");

		// // 调用read()方法读取数据，并把数据显示在控制台
		// // 第一次读取
		// int by = fis.read();
		// System.out.println(by);
		// System.out.println((char) by);
		//
		// // 第二次读取
		// by = fis.read();
		// System.out.println(by);
		// System.out.println((char) by);
		//
		// // 第三次读取
		// by = fis.read();
		// System.out.println(by);
		// System.out.println((char) by);
		// // 我们发现代码的重复度很高，所以我们要用循环改进
		// // 而用循环，最麻烦的事情是如何控制循环判断条件呢?
		// // 第四次读取
		// by = fis.read();
		// System.out.println(by);
		// // 第五次读取
		// by = fis.read();
		// System.out.println(by);
		// //通过测试，我们知道如果你读取的数据是-1，就说明已经读取到文件的末尾了

		// 用循环改进
		// int by = fis.read();
		// while (by != -1) {
		// System.out.print((char) by);
		// by = fis.read();
		// }

		// 最终版代码  fis.read()
		int by = 0;  
		// 读取，赋值，判断
		while ((by = fis.read()) != -1) {
			System.out.print((char) by);
		}  
       //一次读取1024个字节
		FileInputStream fis2 = new FileInputStream("G:\\aaa\\bbb.txt");
		//最终代码选这个同时读取1024字节的，比较有效率
		byte[] bys = new byte[1024];
		int len = 0;
		System.out.println(System.currentTimeMillis());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(System.currentTimeMillis()));
		while ((len = fis2.read(bys)) != -1) {
			System.out.print(new String(bys, 0, len));
		}
		// 释放资源
		fis.close();
		
		String s = "qweqwe";
		// [-50, -46, -80, -82, -60, -29, -42, -48, -71, -6]

		byte[] bys1 = s.getBytes();
	    for(byte a:bys1){
	    	System.out.print(a+",");
	    }
		System.out.println(Arrays.toString(bys1));
	}
}
