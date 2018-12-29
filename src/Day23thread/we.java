package Day23thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;



public class we {
     public static void main(String[] args) {
		 
    	 changeDate(new Date());
    	 String str="qweqwetqerwe";
    	 String arr[]=str.split(",");
    	 for(String s :arr){
    		 
    		 System.out.println(s);
    	 }
	}
     public static String changeDate (Date date){
    	 
    	 SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss",Locale.CHINA);
 		 String dateStr="";
 		dateStr=sdf.format(date);

    	 System.out.println(dateStr);
    	 return dateStr;
     }
}
