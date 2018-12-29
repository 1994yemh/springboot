package Day05To06MethodArr;

import java.util.Scanner;

class ArrayDemo2 {
	public static void main(String[] args) {
	
		int a[][]={{4,5,6},{7,848,99},{54,78,96}};
		printArray2(a);
		int b[][]={{22,66,44},{77,33,88},{25,45,65},{11,66,9}};
		System.out.println(getSum(b));
		System.out.println("++++++++++++++++++++++++++");
		int c[]={4,5,6,7,8,9};
		getData(c);
		int d[]=new int[6];
		Scanner sc=new Scanner(System.in);
	    for(int i=1;i<=6;i++){
	    	 System.out.println("请输入第"+i+"个数字");
	    	 int q=sc.nextInt();
	    	 d[i-1]=q;
	    }
	    getData(d);
	    
	}
	//遍历二维数组
	public static void printArray2(int[][] arr) {
		System.out.print("{");
		for(int x=0; x<arr.length; x++) {
			for(int y=0; y<arr[x].length; y++) {
				if(y==0){
					System.out.print("{"+arr[x][y]+",");
				}
				else if(y==arr[x].length-1 && x==arr[x].length-1){
					System.out.print(arr[x][y]+"}");
				}
				else if(y==arr[x].length-1){
					System.out.print(arr[x][y]+"},");
				}
				else{
					System.out.print(arr[x][y]+",");
				}
			}
			
		}
		System.out.println("}");
	}
	  /*  公司年销售额求和
			某公司按照季度和月份统计的数据如下：单位(万元)
			第一季度：22,66,44
			第二季度：77,33,88
			第三季度：25,45,65
			第四季度：11,66,9   */
	
	
	public static int getSum(int arr[][]){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			for(int n=0;n<arr[i].length;n++){
				
				sum=sum+arr[i][n];
			}
			
		}
		return sum;
	}
        /*需求：打印杨辉三角形(行数可以键盘录入)
	
				1
				1  1	
				1  2  1
				1  3  3  1
				1  4  6  4   1 
				1  5  10 10  5  1     */
	/*
	某个公司采用公用电话传递数据信息，数据是小于8位的整数，为了确保安全，
	在传递过程中需要加密，加密规则如下：
		首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字，
		最后将第一位和最后一位数字交换。 请任意给定一个小于8位的整数，
		然后，把加密后的结果在控制台打印出来。  	int c[]={9,8,7,6,5,4};   */
	public static void getData(int [] arr){
		ArrayDemo1.niXu(arr);
		for(int i=0;i<arr.length;i++){
			
			arr[i]=(arr[i]+5)%10;		
			}
		int temp;
		temp=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		ArrayDemo1.printArray(arr);
	}
	/*
	 * 把刚才的代码改进一下：
		A:把数据改进为键盘录入
		B:把代码改进为方法实现*/ 
	 
}