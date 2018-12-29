package Day01To03Switch;


/**
 * 作者：叶茂华
 * 需求内容：
 * 创建时间 : 2017年8月11日 下午4:38:07 
 * @version 1.0
 */
public class Review {
	public static void main(String[] args) {
		
		
		int a = 3;
		int b = 4;
		
		//int c = a++;
		//int d = b--;
		
		int c = ++a;
		int d = --b;
		
		System.out.println("a:"+a); //4, 4
		System.out.println("b:"+b); //3, 3
		System.out.println("c:"+c); //3, 4
		System.out.println("d:"+d); //4, 3
		
		int f=5;
		byte g=(byte) (f+3);
		System.out.println(f);
		System.out.println(g);
		
		
		byte h=5;
		int  l=h+3;
		System.out.println(h);
		System.out.println(l);
		
		
		int v = 10;
		int n = 20;
		int m = (v = n); //把b赋值给a，然后把a留下来
		System.out.println(m);
	}
}