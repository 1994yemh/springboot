package Day01To03Switch;

import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
		while (true) {
			System.out.println("请输入1-12以内的正整数");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			if (a >= 3 && a <= 5) {
				System.out.println(a + "月所对应的季节是春季");
			} else if (a >= 6 && a <= 8) {
				System.out.println(a + "月所对应的季节是夏季");
			} else if (a >= 9 && a <= 11) {
				System.out.println(a + "月所对应的季节是秋季");
			} else if (( a>=1 && a <= 2) || a==12 ) {
				System.out.println(a + "月所对应的季节是冬季");
		    }
			else{
			    System.out.println("您输入的数字有误，请重新输入！");	
			}
			}
	}
}
