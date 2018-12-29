package Day19ExceptionIo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *创建功能：
 *public boolean createNewFile():创建文件 如果存在这样的文件，就不创建了
 *public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了
 *public boolean mkdirs():创建文件夹,如果父文件夹不存在，会帮你创建出来
 *
 *骑白马的不一定是王子，可能是班长。
 *注意：你到底要创建文件还是文件夹，你最清楚，方法不要调错了。
 */
public class FileDemo {
	public static void main(String[] args) throws IOException {
		// 需求：我要在e盘目录下创建一个文件夹demo
	/*	File file = new File("g:\\demo");
		System.out.println("mkdir:" + file.mkdir());
 */
		// 需求:我要在e盘目录demo下创建一个文件a.txt
	/*	File file2 = new File("g:\\demo\\a.txt");
		System.out.println("createNewFile:" + file2.createNewFile());
*/
		// 需求：我要在e盘目录test下创建一个文件b.txt
		// Exception in thread "main" java.io.IOException: 系统找不到指定的路径。
		// 注意：要想在某个目录下创建内容，该目录首先必须存在。
		// File file3 = new File("e:\\test\\b.txt");
		// System.out.println("createNewFile:" + file3.createNewFile());

		// 需求:我要在e盘目录test下创建aaa目录
		// File file4 = new File("e:\\test\\aaa");
		// System.out.println("mkdir:" + file4.mkdir());

		// File file5 = new File("e:\\test");
		// File file6 = new File("e:\\test\\aaa");
		// System.out.println("mkdir:" + file5.mkdir());
		// System.out.println("mkdir:" + file6.mkdir());

		// 其实我们有更简单的方法
		/*File file7 = new File("g:\\aaa\\bbb\\ccc\\ddd");
		//System.out.println("mkdirs:" + file7.mkdirs());

		// 看下面的这个东西：
		File file8 = new File("g:\\liuyi\\a.txt");
		System.out.println("mkdirs:" + file8.mkdirs());
		
		File file10=new File("g:\\aaa");
		System.out.println("delete:"+file10.delete());*/
		File file1=new File("g:\\liuyi\\a.txt");
		File file3=new File("g:\\liuyi\\b.txt");
		//System.out.println(file1.renameTo(file3));
		File file4 =new File("g:\\liuyi\\b.txt\\a.txt");
		//System.out.println(file4.createNewFile());
		//System.out.println(file4.delete());
		
	/*	System.out.println("绝对路径："+file4.getAbsolutePath());
		System.out.println("相对路径："+file4.getPath());
		System.out.println("获取名称："+file4.getName());
		System.out.println("获取长度："+file4.length());
		System.out.println("获取最后修改的毫秒数："+file4.lastModified());
		Date d = new Date(file4.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sdf.format(d);
		System.out.println(s);*/
		//获取指定目录下所有文件夹的名称数组和 File数组
		// 指定一个目录
				File file = new File("g:\\");

				// public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
				String[] strArray = file.list();
				for (String s : strArray) {
					System.out.println(s);
				}
				System.out.println("------------");

				// public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组
				File[] fileArray = file.listFiles();
				for (File f : fileArray) {
					System.out.println(f.getName());
				}
	}
}
