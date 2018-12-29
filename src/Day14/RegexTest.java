package Day14;

import java.util.regex.Pattern;



/*
 * 校验邮箱
 * 
 * 分析：
 * 		A:键盘录入邮箱
 * 		B:定义邮箱的规则
 * 			1517806580@qq.com
 * 			liuyi@163.com
 * 			linqingxia@126.com
 * 			fengqingyang@sina.com.cn
 * 			fqy@itcast.cn
 * 		C:调用功能，判断即可
 * 		D:输出结果
 */
public class RegexTest {
	private static final int status = 1;

	public static void main(String[] args) {
		//键盘录入邮箱
		/*Scanner sc = new Scanner(System.in);
		System.out.println("请输入邮箱：");
		String email = sc.nextLine();
		
		//定义邮箱的规则
		//String regex = "[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,6}(\\.[a-zA-Z_0-9]{2,3})+";
		String regex = "\\w+@\\w{2,6}(\\.\\w{2,3})+";
		
		//调用功能，判断即可
		boolean flag = email.matches(regex);
		
		//输出结果
		System.out.println("flag:"+flag);*/
		
		//分割联练习
		/*String age="18-24";
		String regex="-";
		String [] arr=age.split(regex);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		String s3 = "aa    bb                cc";
		String[] str3Array = s3.split(" +");
		for (int x = 0; x < str3Array.length; x++) {
			System.out.println(str3Array[x]);
		} */
		
		/**
		 * 我有如下一个字符串:"91 27 46 38 50"
		 * 请写代码实现最终输出结果是："27 38 46 50 91"
		 */
		/*
		 * 方案一：
		 * String str="91 27 46 38 50";
		String [] arr=str.split(" +");
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(Integer.parseInt(arr[i])>Integer.parseInt(arr[j])){
					
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i].toString()+" ");
		}*/
		
		//方案二： 定义一个字符串
		/*		String s = "91 27 46 38 50";

				// 把字符串进行分割，得到一个字符串数组
				String[] strArray = s.split(" ");

				// 把字符串数组变换成int数组
				int[] arr = new int[strArray.length];

				for (int x = 0; x < arr.length; x++) {
					arr[x] = Integer.parseInt(strArray[x]);
				}

				// 对int数组排序
				Arrays.sort(arr);

				// 把排序后的int数组在组装成一个字符串
				StringBuilder sb = new StringBuilder();
				for (int x = 0; x < arr.length; x++) {
					sb.append(arr[x]).append(" ");
				}
				//转化为字符串
				String result = sb.toString().trim();
				
				//输出字符串
				System.out.println("result:"+result);*/
		//replaceAlll练习
	/*	String s = "helloqq12345worldkh622112345678java";
		String regex="\\d+";
		String a="";
		String result = s.replaceAll(regex, a);
		System.out.println(result);*/
		 //Pattern和Matcher类的使用
		/**
		 *  *模式和匹配器的基本使用顺序		
		 */
		// 模式和匹配器的典型调用顺序
				// 把正则表达式编译成模式对象
				Pattern p = Pattern.compile("a*b");
				// 通过模式对象得到匹配器对象，这个时候需要的是被匹配的字符串
				java.util.regex.Matcher m = p.matcher("aaaaab");
				// 调用匹配器对象的功能
				boolean b = m.matches();
				System.out.println(b);
				
				//这个是判断功能，但是如果做判断，这样做就有点麻烦了，我们直接用字符串的方法做
				String s = "aaaaab";
				String regex = "a*b";
				System.exit(status);
				boolean bb = s.matches(regex);
				System.out.println(bb);
	
		
	}
}