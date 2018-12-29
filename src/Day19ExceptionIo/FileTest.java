package Day19ExceptionIo;

import java.io.File;

/**
 * 
 * 作者：叶茂华
 * 需求内容： 判断g盘目录下是否有后缀名为.jpg的文件，如果有，就输出此文件名称
 * 创建时间 : 2017年9月26日 下午7:40:24 
 * @version
 */
public class FileTest {
    public static void main(String[] args) {
		/* File file=new File("g:\\");
		 File[] fileArray = file.listFiles();
			for (File f : fileArray) {
				if (f.isFile()) {
					// 继续判断是否以.jpg结尾
					if (f.getName().endsWith(".jpg")) {
						// 就输出该文件名称
						System.out.println(f.getName());
					}
				}
			}*/
    	
    	/*需求：把g:\评书\三国演义下面的图片名称修改为
    	 * 		叶茂华.jpg
    	 */
    	File file=new File("g:\\评书\\三国演义");
    	String[] files=file.list();
    	for(String s:files){
    		System.out.println(s);
    		if(s.equals("如今3.jpg")){
    		String	news="叶茂华.jpg";
    			File oldfile=new File("g:\\评书\\三国演义\\"+s);
    			File newfile=new File("g:\\评书\\三国演义\\"+news);
    			System.out.println(oldfile.renameTo(newfile));
    		}
    	}
	}
}
