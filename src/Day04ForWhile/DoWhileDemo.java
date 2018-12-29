package Day04ForWhile;

public class DoWhileDemo {
   public static void main(String[] args) {
	 //输出1次HelloWorld。
	 		int x = 0;
	 		do {
	 			System.out.println("HelloWorld");
	 			x++;
	 		}while(x>10);
	 		
	  int y=1;
	  int sum=0;
	  do{
          sum=sum+y;  
        y++;
	  }while(y<=100);
	  System.out.println(sum);
	 		
}
   
    
}
