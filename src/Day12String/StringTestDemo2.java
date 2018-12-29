package Day12String;

import java.util.Scanner;

/**
 * 
 * 作者：叶茂华
 * 需求内容：
 * 1.把数组中的数据按照指定个格式拼接成一个字符串
 * 举例：
 * 		int[] arr = {1,2,3};	
 * 输出结果：
 *		"[1, 2, 3]"
 * 2.统计大串中小串出现的次数
 * 举例：
 * 		在字符串"woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun"
 * 结果：
 * 		java出现了5次
 * 3.  字符串反转
 *   举例：键盘录入”abc”		
 *   输出结果：”cba”
 * 4.
 * 创建时间 : 2017年8月28日 上午10:38:26 
 * @version
 */
public class StringTestDemo2 {
    public static void main(String[] args) {
    	//1.输出格式
    	int[] arr = {1,2,3};
    	System.out.println(arr.toString());;
        
    	System.out.print("[");
    	for(int i=0;i<arr.length;i++){
    		if(i==arr.length-1){
    			System.out.println(arr[i]+"]");
    		}
    		else{
    			System.out.print(arr[i]+",");
    		}
    	}
    	
    	String a="[";
    	for(int i=0;i<arr.length;i++){
    		if(i==arr.length-1){
    			a+=arr[i]+"]";
    			
    		}
    		else{
    			a+=arr[i]+",";
    		
    		}
    	}
    	System.out.println(a);
    	//2.输出大串中出现小串的次数
    	String w="woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
    	String s="java";
    	int count=0;
    	while(w.contains(s)){
    		int i=w.indexOf(s);
    		count++;
        	System.out.println(i);
        	w=w.substring(i+4, w.length());
        	System.out.println(w);
    	}
    	System.out.println("这个字符串中出现java的次数是："+count+"次");
    	/*字符串反转
    	 *   举例：键盘录入”abc”		
    	 *   输出结果：”cba”*/
    	Scanner sc=new Scanner(System.in);
    	System.out.println("请输入需要反转的字符串");
    	String n=sc.nextLine();
    	char[] ch=n.toCharArray();
    	for(int i=0;i<ch.length/2;i++){
    		char temp;
    		temp=ch[i];
    		ch[i]=ch[ch.length-1-i];
    		ch[ch.length-1-i]=temp;
    	}
    	for(int i=0;i<ch.length;i++){
    		
    		System.out.println(ch[i]);
    	}
    	String dd=String.valueOf(ch);
    	System.out.println(dd);
    }
}
