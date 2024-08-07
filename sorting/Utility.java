package sorting;

public class Utility {

	public static void main(String[] args) {
		
		int arr[]= {1,5,4,3,9,7};
		int arr1[]=new int[7];
				arr1=BubbleSort.getBubbleSort(arr);
				
				for(int i:arr1)
					System.out.println(i);
		
	}


}
