package Day14;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 
 * 作者：叶茂华
 * 需求内容：获取任意一年的二月有多少天
 * 创建时间 : 2017年9月19日 下午8:11:41 
 * @version
 */
public class CalendarTest {
   public static void main(String[] args) {
	 Calendar c=Calendar.getInstance();
	 Scanner sc =new Scanner(System.in);
	 System.out.println("请输入年月日格式为yyyy-MM-dd");
	 String str=sc.nextLine();
	 int year=Integer.parseInt(str.substring(0, 4));
	 int month=Integer.parseInt(str.substring(5, 7));
	 int date=Integer.parseInt(str.substring(8, 10));
	 System.out.println(month);
	 c.set(2011, 11, 11);
	 System.out.println(c.get(Calendar.MONTH));
	 if((year%4==0 && year%100!=0) || year%400==0 ){
		 System.out.println(year+"年，当年二月是润年29天");
	 }
	 else{
		 System.out.println(year+"年，当年二月是平年28天");
		
	 }
	// 键盘录入任意的年份
				/*	Scanner sc = new Scanner(System.in);
					System.out.println("请输入年份：");
					int year = sc.nextInt();

					// 设置日历对象的年月日
					Calendar c = Calendar.getInstance();
					c.set(year, 3, 1); // 其实是这一年的3月1日
					// 把时间往前推一天，就是2月的最后一天
					c.add(Calendar.DATE, -1);

					// 获取这一天输出即可
					System.out.println(c.get(Calendar.DATE)); */
   }
}


