package Day12String;

/**
 * 
 * 作者：叶茂华
 * 需求内容：需求：把一个字符串的首字母转成大写，其余为小写。(只考虑英文大小写字母字符)  helloWORLD
 * 创建时间 : 2017年8月28日 上午9:42:13 
 * @version
 */
public class StringTestDeom {
   public static void main(String[] args) {
	 String a="helloWORLD";
	 System.out.println(a.toLowerCase());
	 System.out.println(a.toLowerCase().substring(0,1).toUpperCase().concat(a.toLowerCase().substring(1,a.length())));
	
}
}
