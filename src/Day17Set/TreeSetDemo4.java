package Day17Set;

import java.util.TreeSet;

/*
 * TreeSet：能够对元素按照某种规则进行排序。
 * 排序有两种方式
 * A:自然排序
 * B:比较器排序
 * 
 * TreeSet集合的特点：排序和唯一
 * 
 * 通过观察TreeSet的add()方法，我们知道最终要看TreeMap的put()方法。
 */
public class TreeSetDemo4 {
	public static void main(String[] args) {
		// 创建集合对象
		// 自然顺序进行排序
		TreeSet<String> ts = new TreeSet<String>();

		// 创建元素并添加
		// 20,18,23,22,17,24,19,18,24
		ts.add("qwe");
		ts.add("hello");
		ts.add("qwe");
		ts.add("22");
		ts.add("17");
		ts.add("24");
		ts.add("19");
		ts.add("88887");
		ts.add("qe");

		// 遍历
		for (String i : ts) {
			System.out.println(i);
		}
	}
}