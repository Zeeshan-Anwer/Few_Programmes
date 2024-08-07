package test;

class BubbleSort{

public static void main (String args[]) {


	int arr[]={2,3,1,4,9,7};
	int length=arr.length-1;
	int temp=0;
	for(int i=0;i<length;i++)
		for(int j=1;j<length-i;j++){
			
			if(arr[j-1]>arr[j])
					{
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
}//if
}//for
	
		for(int res:arr)
			System.out.print(res+" ");
}//main
}//class