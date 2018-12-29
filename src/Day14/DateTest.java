package Day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * 作者：叶茂华
 * 需求内容：算一下你来到这个世界多少天了
 * 创建时间 : 2017年9月20日 上午8:49:58 
 * @version
 */
public class DateTest {
   public static void main(String[] args) {
	 Long nowTime = new Date().getTime();
	 System.out.println(nowTime);
	 String str="1994-10-26";
	 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	 try {
		Long passTime=sdf.parse(str).getTime();
		System.out.println(passTime);
		//Long sub=nowTime-passTime;
		Long sub=(nowTime-passTime);
		long day = sub / 1000 / 60 / 60/24/365 ;
		System.out.println(day);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
