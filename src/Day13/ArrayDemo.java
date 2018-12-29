package Day13;

import Day07FaceObject.ArrayDemo1;

public class ArrayDemo {
    public static void main(String[] args) {
		/*
		 * 1.数组排序之冒泡排序：
         * 相邻元素两两比较，大的往后放，第一次完毕，最大值出现在了最大索引处
		 * 
		 * */
    	int arr[]={10,8,9,7,6};
    	bubbleSort(arr);
    	ArrayDemo1 ad=new ArrayDemo1();
    	ad.printArray(arr);
    	/*
    	 *  把字符串中的字符进行排序。
	      	举例："dacgebf"
	 		结果："abcdefg"
    	 * */
    	String a="dacgebf";
    	char ch[]=a.toCharArray();
    	bubbleSort2(ch);
    	String b=String.valueOf(ch);
    	System.out.println(b);
	}
    public static void bubbleSort(int[] arr){
		for (int x = 0; x < arr.length - 1; x++) {
			for (int y = 0; y < arr.length - 1 - x; y++) {
				if (arr[y] <arr[y + 1]) {
					int temp = arr[y];
					arr[y] = arr[y + 1];
					arr[y + 1] = temp;
				}
			}
		}
	}
    public static void bubbleSort2(char[] ch){
		for (int x = 0; x < ch.length - 1; x++) {
			for (int y = 0; y < ch.length - 1 - x; y++) {
				if (ch[y] >ch[y + 1]) {
					char temp = ch[y];
					ch[y] = ch[y + 1];
					ch[y + 1] = temp;
				}
			}
		}
	}
}
