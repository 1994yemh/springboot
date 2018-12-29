package Day05To06MethodArr;

import java.util.Scanner;

/*
 * 键盘录入两个数，求这俩个数的最大值
 */
public class MethodDemo {
     public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入要比较的第一个正整数：");	
		int a=sc.nextInt();
		System.out.println("请输入要比较的第二个正整数：");	
		int b=sc.nextInt();
		System.out.println("请输入要比较的第三个正整数：");	
		int c=sc.nextInt();
		MethodDemo md=new MethodDemo();
		System.out.println(md.getMax(a,b,c));
		System.out.println(isEqual(a,b));
	}
     public  int getMax(int a,int b,int c){
    	 
    	 return (a>b?a:b)>c?(a>b?a:b):c; 
     }
     public static boolean isEqual(int a,int b){
    	 
    	 return a==b; 
     }
}