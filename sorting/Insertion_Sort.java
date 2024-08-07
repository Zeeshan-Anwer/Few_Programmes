package sorting;

public class Insertion_Sort {
	
	public static void main(String args[]) {
		
		int arr[]= {12,25,56,74,45};
			int temp,j;
		
			for(int i=0;i<arr.length;i++) {
				temp=arr[i+1];
				j=i+1;
				
				while(j>0 && arr[j]>temp) {
					
					arr[j]=arr[j-1];
					j=j-1;
				}
				
				arr[j]=temp;
				
			}
				for(int a:arr)
					System.out.println(a);
					
			}
		}
		
	


