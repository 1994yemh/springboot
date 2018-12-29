package Day05To06MethodArr;

/*
	定义一个数组，输出该数组的名称和数组元素值。
	给数组元素赋值，再次输出该数组的名称和数组元素值。
*/
class ArrayDemo1 {
	public static void main(String[] args) {
		//定义一个数组
		int[] arr = new int[3];
		
		//输出数组名称
		System.out.println(arr);
		//输出数组元素值
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("----");
		
		//给数组元素赋值
		arr[0] = 100;
		arr[2] = 200;
		
		//输出数组名称
		System.out.println(arr);
		//输出数组元素值
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println("-------------");
		
		int [] arr3=arr;
		arr3[1]=50;
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		
		int a[]={1,3,4};
		System.out.println("-------------");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		int arr6[]={1,3,4};
		System.out.println(getMax(arr6));
		System.out.println("-------------");
		int arr7[]={1,5,6,7};
		//逆序前
		printArray(arr7);
		//逆序后
		niXu(arr7);
		printArray(arr7);
		System.out.println("");
		System.out.println(arr7[0]);
		System.out.println(arr7[1]);
		System.out.println(arr7[2]);
		System.out.println(arr7[3]);
		System.out.println("-------------");
		System.out.println(getIndex(arr7,6));
	}
	//求一个数组中的最大值。
	public static int getMax(int arr[]){
		int max = 0;
		max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<max){
				max=arr[i];
				
			}
		}
		return  max;
	}
	//将元素逆序    int arr[]={1,3,4,5,6}
	public static void niXu (int arr[]){
		
		for(int i=0;i<(arr.length)/2;i++){
			  int temp=0;
			 temp=arr[i];
			 arr[i]=arr[(arr.length)-(i+1)];
			 arr[(arr.length)-(i+1)]=temp;
		}
		
	}
	//遍历数组
	public static void printArray (int arr[]){
	
		System.out.print("int arr7[]={");
		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1){
				System.out.println(arr[arr.length-1]+"}");	
			}
			else{System.out.print(arr[i]+",");
			}
		}	
	}
	//需求：数组元素查找(查找指定元素第一次在数组中出现的索引)
	public static int getIndex(int arr[],int value){
		int index=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==value){
				index=i;
				break;
			}
			
		}
		return index;
	}
	
	
	
}