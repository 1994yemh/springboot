package Day21_IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ArrListToOutPut {
	/*
	 * 将集合写入 文本中
	 * */
	public static void main(String[] args) throws FileNotFoundException {
		 /*	 File file=new File("G:\\aaa\\bbb.txt");
		   List<String> lis =new ArrayList<String>();
		    lis.add("hello");
		    lis.add("world");
		    lis.add("java");
		 BufferedWriter bw=new BufferedWriter(new FileWriter(file));
		 
		 for(String ls:lis){
		    bw.write(ls);
		    bw.newLine();
		    bw.flush();
		 }
		 bw.close();
	
   */
     /*将文本插入到集合中*/
    /* File file=new File("G:\\aaa\\bbb.txt");
     List<String> lis =new ArrayList<String>();
	 BufferedReader br=new BufferedReader(new FileReader(file));
	 String str=null;
	 try {
		while((str=br.readLine())!=null){
			lis.add(str);
		
		 
		 }
		br.close();
		for(String ls :lis){
			System.out.println(ls);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 */
	/*获取文本中随机一个名字输出
		File file=new File("G:\\aaa\\bbb.txt");
	     List<String> lis =new ArrayList<String>();
		 BufferedReader br=new BufferedReader(new FileReader(file));
		 String str=null;
		 try {
			while((str=br.readLine())!=null){
				lis.add(str);
			
			 
			 }
			br.close();
			Random r = new Random();
			int index = r.nextInt(lis.size());
			System.out.println(lis.get(index));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}
}
