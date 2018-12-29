package Day04ForWhile;
/*
 * 1.需求：请输出一个4行5列的星星(*)图案。
     结果：
	*****
	*****
	*****
	*****
	*
   2.需求：请输出下列的形状
		*
		**
		***
		****
		*****
	*/
public class ForForDemo {
     public static void main(String[] args) {
    	 start();
    	 System.out.println("----------------------");
    	 getStart();
    	 kouJueBiao();
    	 System.out.println(dateCount());
	}
   public static void start(){
	   for(int i=0;i<=3;i++){
		  for(int n=0;n<=4;n++){
			  
			  System.out.print("*");
		  }
		  System.out.println(""); 
	   }
	   
   }  
   /*
        *
		**
		***
		****
		*****
    */
   public static void getStart(){   
	
	   for(int i=0;i<=4;i++){
			  for(int n=0;n<=i;n++){
				  
				  System.out.print("*");
			  }
			  System.out.println(""+'\t'+"sdas"); 
		   }
   }
   /*
    * 需求：在控制台输出九九乘法表。
	
	首先我们写出九九乘法表：
		1*1=1
		1*2=2	2*2=4
		1*3=3	2*3=6	3*3=9
		1*4=4	2*4=8	3*4=12	4*4=16
		...
		1*9=9	2*9=18	3*9=27	...
    * 
   
    */
    
    public static void kouJueBiao(){
    	for(int i=1;i<=9;i++){
    		for(int j=1;j<=i;j++){
    			System.out.print(j+"*"+i+"="+j*i+'\t');
    		}
    		System.out.println("");
    	}
    }
    /*
     * 需求：小芳的妈妈每天给她2.5元钱，她都会存起来，但是，
	      每当这一天是存钱的第5天或者5的倍数的话，她都会花去6元钱，
		  请问，经过多少天，小芳才可以存到100元钱。
     * 
     * 
     * */
    public static int dateCount(){
    	double sum=0;
    	int date=0;
    	double initMoney=2.5;
    	while(sum<=100){
    		date++;
    		sum=sum+initMoney;
    		if(date%5==0){
    			sum=sum-6;
    		}
    	}
    	
    	return date ;
    }
}
