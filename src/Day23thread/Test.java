package Day23thread;

import java.util.Date;
import java.util.Random;

public class Test {  
	  
	  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
      
    	//aaa();
    	 double a=10.0;
    	 try{
    		 double c=a/0;
    		 System.out.println(c);
    	 }catch(Exception e){
    		 System.out.println("wqe");
    	 }
    } 
    
    /** 
     * 生成随机数字 
     *  
     * @return 
     */  
    @SuppressWarnings("finally")
	public static  String aaa(){
    	Date a1=new Date();
	 Random random = new Random();  
    String num = random.nextInt(9999999) + "";  
    System.out.println(num);
    StringBuffer sb = new StringBuffer();  
    for (int i = 0; i < 7 - num.length(); i++) {  
        sb.append("0");  
    }  
    try{
    num = sb.toString() + num;  
    Date b1=new Date();
    System.out.println(num);  
    System.out.println("1.获取发起人部门名称两个时间相差"+(float)(b1.getTime() - a1.getTime())/1000+"秒"); 
    System.out.println(1/0);   
    return num;
    }catch(Exception e) {
    	System.out.println("catch");  
    }finally{
    	System.out.println("finally"); 
    	
    }
    return "1";
    }
}  