package Day16ArrarList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * 作者：叶茂华 需求内容：ArrayList去除集合中字符串的重复值(字符串的内容相同) 创建时间 : 2017年9月21日 上午10:25:25
 * 
 * @version
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("hello");
		//方法一：在原有的几个上做
		/*for (int i = 0; i < list.size()-1; i++) {
			for (int j = 1; j < list.size(); j++) {
				
				if (list.get(i).equals(list.get(j))) {
					list.remove(j);
					//System.out.println(111);
				} 
			}

		}
		for (String s : list) {
			System.out.println(s);
		}*/
		//方法二：
		/*List<String> newlist=new ArrayList<String>();
		for(String s : list){
			if(!(newlist.contains(s))){
				//System.out.println(23);
				newlist.add(s);
			}
		}
		for(String a :newlist){
			System.out.println(a);
		}*/
		
		/**
		 * 获取10个1-20之间的随机数，要求不能重复
		 */
		List lis=new ArrayList();
		for(int i=0;i<10;i++){
			int number = (int) (Math.random() * (20 - 1 + 1)) + 1;
			
			if(!(lis.contains(number))){
				lis.add(number);
			}
		}
		Iterator it =lis.iterator();
		while(it.hasNext()){
			int s=(int)it.next();
			System.out.println(s);
		}
		/**
		 * 键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值
		 */
		Collection c = new ArrayList();
		c.add("hello");
		c.add("world");
		c.add("java");
		
		System.out.println(c);
	}
}
