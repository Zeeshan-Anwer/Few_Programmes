package test;

public class notAlone {
	
	public static void main(String[] args) {
		
		int arr[]= {3, 4},g=0;
		int size=arr.length-1;
		for(int i=1;i<size;i++) {
			
			
			
			if(arr[i]!=arr[i+1] && arr[i]!=arr[i-1]) {
				
				if(arr[i+1]>arr[i-1])
					g=arr[i+1];
				else
					g=arr[i-1];
				
			}
			arr[i]=g;
		}
		
		for(int i:arr)
			System.out.println(i);
		
	}
	
	//exam code
	


}
