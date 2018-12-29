package Day12String;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 作者：叶茂华
 * 需求内容：统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
 * 创建时间 : 2017年8月25日 下午5:43:21 
 * @version
 */
public class StringDemo2 {
     public static void main(String[] args) {
		String a="Hello123World";
		int lowerCount=0;
		int upperCount=0;
		int numCount=0;
		List lowertlist=new ArrayList<>();
		List upperlist=new ArrayList<>();
		List numlist=new ArrayList<>();
		for(int i=0;i<a.length();i++){
			char b=a.charAt(i);
			if((int)b>=65 && (int)b<=97){
				upperlist.add(b);
				upperCount++;
			}
			if((int)b>=97  && (int)b<=122){
				lowertlist.add(b);
				lowerCount++;
			}
			if((int)b>=48  && (int)b<=57){
				numlist.add(b);
				numCount++;
			}
		}
		System.out.print("Hello123World中大写字母有"+upperCount+"个,分别是：");
		for(int i=0;i<upperlist.size();i++){
			System.out.print(upperlist.get(i)+",");
		}
		System.out.print("小写字母有"+lowerCount+"个,分别是：");
		for(int i=0;i<lowertlist.size();i++){
			System.out.print(lowertlist.get(i)+",");
		}
		System.out.print("数字有"+numCount+"个,分别是：");
		for(int i=0;i<numlist.size();i++){
			System.out.print(numlist.get(i)+",");
		}
	}
}
