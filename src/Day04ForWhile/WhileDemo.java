package Day04ForWhile;
/**
 * 
 * 作者：叶茂华
 * 需求内容：
 * 1.左边：求出1-100之和
 * 2.右边：统计1000以内的水仙花数有多少个
 * 3.我国最高山峰是珠穆朗玛峰：8848m，我现在有一张足够大的纸张，厚度为：0.01m。
 * 请问，我折叠多少次，就可以保证厚度不低于珠穆朗玛峰的高度?
 * 创建时间 : 2017年8月15日 上午9:22:05 
 * @version
 */
public class WhileDemo {
    public static void main(String[] args) {
		 int x=1;
		 int sum=0;
		 while(x<=100){
			 sum=sum+x;
			 x++;
		 }
		 System.out.println(sum);
		 
		System.out.println(count());
		System.out.println(getTimes());
		
	}
    public static int count(){
    	int count=0;
    	int x=1;
    	while(x<=1000){
    		 int d=x%10;
        	 int e= x/10/10;
        	 int f=x/10%10;
        	 int s=d*d*d+e*e*e+f*f*f;
        	 
    		if(x==s){
    			System.out.println(x);
    			count++;
    		}
    		x++;
    	}
    	return count;
    }
   /* 3.我国最高山峰是珠穆朗玛峰：8848m，我现在有一张足够大的纸张，厚度为：0.01m。
        请问，我折叠多少次，就可以保证厚度不低于珠穆朗玛峰的高度?
      1  0.02
      2  0.04
      3  0.08
      4  0.16  
        *
        */
    public static int getTimes(){
    	int count=0;
    	double init=0.01;
    	double  sum=0;
    	while(sum<=8848){
    		
    		sum=sum+init;
    		init=2*init;
    		count++;
    	}
    	return count;
    }
}
