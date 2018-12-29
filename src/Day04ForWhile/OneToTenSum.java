package Day04ForWhile;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthSpinnerUI;

/**
 *  1.求出 1-10之间的数据之和
 *  2.求出1-10之间的偶数和
 *  3.求出1-10之间的奇数和
 *  4.求出5的阶乘   5*4*3*2*1
 *  5.判断一个数是否为水仙花数
 *  6.请在控制台输出满足如下条件的五位数
		个位等于万位
		十位等于千位
		个位+十位+千位+万位=百位
	7.需求：请统计1-1000之间同时满足如下条件的数据有多少个：
			对3整除余2
			对5整除余3
			对7整除余2	
 */
public class OneToTenSum {
      public static void main(String[] args) {
		int sum=0;
    	  for(int a=1;a<=10;a++){
			 sum=sum+a;
			 
		 }
    System.out.println(sum);
	
      
      int temp=0;
      for(int i=2;i<=10;i=i+2){
    	temp=temp+i;  
    	
      }
      System.out.println(2+4+6+8+10);
      System.out.println(temp);
      
      jieCheng(5);
      
    System.out.println(waterDate(153)); 
    fiveData();
    List<Integer> list=new ArrayList<Integer>();
    list=getData();
    for(Integer a : list) {
    	  System.out.println(a);
    	}
}
      public static int jieCheng(int a){
    	  int b=1;
    	  for(int i=1;i<=a;i++){
    		  
    		  b=b*i;
    	  }
    	System.out.println(5*4*3*2*1);
    	System.out.println(b);  
		return b; 
      }
      public static int waterDate(int a){
    	 int d=a%10;
    	 int e= a/10/10;
    	 int f=a/10%10;
    	 int s=d*d*d+e*e*e+f*f*f;
    	 
    	  return s;
   
      }
    /**
     * 6.请在控制台输出满足如下条件的五位数
		个位等于万位
		十位等于千位
		个位+十位+千位+万位=百位
     */
      public static void fiveData(){
    	 
    	  for(int l=10000;l<=99999;l++){
    		  int a=l/10000; //万位
    		  int b=l%10000/1000;//千位
    		  int c=l%10000%1000/100;//百位
    		  int d=l%10000%1000%100/10;//十位
    		  int e=l%10;//个位
    		 if((e==a)  &&  (b==d) && (e+d+b+a==c)){
    			 System.out.println(l);
    			 
    		 }
    		  
    	  } 
      }
     /* 7.需求：请统计1-1000之间同时满足如下条件的数据有多少个：
		对3整除余2
		对5整除余3
		对7整除余2
	*/
      public static List getData(){
    	  List<Integer> a =new ArrayList<Integer>();
    	  for(int x=1;x<=1000;x++){
    		  if(x%3==2 && x%5==3 && x%7==2){
    			  
    			  a.add(x);
    		  }
    		  
    	  }
    	  return a;
      }
}