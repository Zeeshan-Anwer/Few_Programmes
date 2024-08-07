package sorting;

public class BubbleSort {
	
	public static int[] getBubbleSort(int arr[]) {
		
		int temp=0;
		for(int i=1;i<arr.length-2;i++)
			for(int j=1;j<=arr.length-i;j++) {
				
				if(arr[j-1]>arr[j])
				{
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=arr[j];
				}
			}
		return arr;
	}

}


