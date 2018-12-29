package Day20Io_digui;

import java.util.Scanner;

/*
 * 需求：请用代码实现求5的阶乘。
 * 
 * */
public class DiGuiTest {
   public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("请输入一个正整数");
	 int s =sc.nextInt();
	 System.out.println(s);
	 int sum5=1;
	 while(s!=0){
		 sum5 =sum5*s;
		 s--;	
	 }
	// System.out.println(sum5);
	 /*
	  *  有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第二十个月的兔子对数为多少？
 * 分析：我们要想办法找规律
 * 			兔子对数
 * 第一个月： 	1  sum=1
 * 第二个月：	1  sum2=1
 * 第三个月：	2   sum+sum2=2  sum  1   sum2 1
 * 第四个月：	3	sum2 + sum+sum2=3  sum  1   sum2 2
 * 第五个月：	5    sum+sum2 +sum2 + sum+sum2 =5
 * 第六个月：	8   sum2 + sum+sum2+ sum+sum2 +sum2 + sum+sum2 
 * 第七个月：	13
	  * */
	  int a[]=new int[20];
	
	  a[0]=1;
	  a[1]=1;
	  int count=2;
	  int sum=a[0]+a[1];
	  for(int i=2;i<20;i++){
		  a[i]=a[i-1]+a[i-2];
		  sum+=a[i];
		  System.out.println(a[i]);
		  count++;
	  }
	  System.out.println(count);
	  System.out.println(sum);
	  
	  
	  System.out.println(fib(20));
	  
	}
   public static int fib(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}
}
