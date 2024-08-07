
public class Sort {


	public static void main (String args[]) {


		int arr[] = { 35, 17, 19, 13, 34 };
				int temp=0;

				for(int i=0;i<arr.length-1;i++)
					for(int j=1;j<arr.length;j++) {
						if (arr[j - 1] > arr[j]) {
							temp = arr[j - 1];
							arr[j - 1] = arr[j];
							arr[j]=temp;
						}
					}

				
					for(int res:arr)
						System.out.print(res+" ");
			}// main
}// class

