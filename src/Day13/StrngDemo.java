package Day13;

import java.util.Scanner;

public class StrngDemo {
     public static void main(String[] args) {
    	/* 判断一个字符串是否是对称字符串
    	 * 例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"是对称字符串*/
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("请输入一个字符串");
    	 String a=sc.nextLine();
    	 int count =0;
    	 
    		 char[] s = a.toCharArray();
    		
    		 for(int i=0;i<s.length/2;i++){
    			 if(s[i]==s[s.length-1-i]){
    				 count++;
    				
    			 }
    			 
    		 }
    	
  	
    	if(count==a.length()/2){
    			 System.out.println("这是个对称字符串");
    		 }
        else{
    			 System.out.println("这不是个对称字符串");
    		 }
    	 
    	StringBuffer sb=new StringBuffer();
    	sb.append(a);
    	Boolean flag=sb.reverse().toString().equals(a);
    	System.out.println(flag);
    	if(flag){
    		System.out.println("这是个对称字符串");
    	}
    	
	}
}
