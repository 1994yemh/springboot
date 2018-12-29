package Day07FaceObject;

import java.util.Random;
import java.util.Scanner;

/** 
 * 
 * 作者：叶茂华
 * 需求内容：猜数字小游戏1-100
 * 创建时间 : 2017年8月19日 下午4:47:54 
 * @version
 */
public class GuessNumber {
     public static void main(String[] args) {
    	int a= new Random().nextInt(100) +1;
    	//int number = (int)(Math.random()*100)+1;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("请输入一个1-100内的正整数");
    	int b=sc.nextInt();
    	while(true){
    		if(a<b){
    			System.out.println("请输入的数太大，请重新输入！");
    			b=sc.nextInt();
    		}
    		if(a>b){
    			System.out.println("请输入的数太小，请重新输入！");
    			b=sc.nextInt();
    		}
    		if(a==b){
    			System.out.println("恭喜你回答正确！");
    			break;
    		}
    	}

	}
    
}
