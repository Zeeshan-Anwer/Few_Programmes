package test;

public class Test {
	
	public static void main(String[] args) {
		
		int arr[]= {5,3,6,2,8,1};
		bubbleSort(arr);
	}
	
	public static void bubbleSort(int arr[]) {
		
		int temp=0;
		for(int i=0;i<arr.length-1;i++) 
			for(int j=1;j<arr.length-1;j++) {
				if(arr[j-1]>arr[j])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
				for(int a:arr) {
					System.out.print(a);
				}
			}
		
	}

}
