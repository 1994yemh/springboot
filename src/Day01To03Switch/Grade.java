package Day01To03Switch;

import java.util.Scanner;


public class Grade {
   public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int a=sc.nextInt();
	  while(true){
		   if(a>=0 && a<=100){
			   int b=a/10;
				  switch (b){
				  case 9 :
				     System.out.println("A等");  
				     break;
				  case 10 :
					     System.out.println("A等"); 
					     break;
				  case 8 :
					     System.out.println("B等");
					     break;
				  case 7 :
					     System.out.println("C等"); 
					     break;
				  case 6 :
					     System.out.println("D等");
					     break;
			      default :
			    	    System.out.println("E等");
				  } 
			   break;
		   }
		   else{
			  System.out.println("您输入的成绩有误，请重新输入！");
			  a=sc.nextInt();
		   }
	  }
	  
	  
	 
	 
}
}
