package test;


import java.util.Arrays;

public class Myprg{

	public static void main(String[] args) {
		int arr[]= {1,2,3};
		notalone(arr);
	}
	
	public static void notalone(int arr[]) {
			int size = arr.length-1;int g=0;
					for(int i=1;i<size;i++) {
							if(arr[i]!=arr[i-1]&& arr[i+1]!=arr[i]) {
									if((i-1)>(arr[i+1])) {
											g=arr[i-1];
										}
										else {
					g=arr[i+1];
										}
							}
							for(int j:arr)
								System.out.println(j);
						}

	}
}


