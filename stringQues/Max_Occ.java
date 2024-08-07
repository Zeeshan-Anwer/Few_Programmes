package stringQues;

public class Max_Occ {
	
	public static void main(String[] args) {
		String s="abcacbc";
		System.out.println((maxOccur(s)));
	
	}
	
	public static char maxOccur(String str) {
	
	char ans ='a';
	int length =str.length();
	int count[]=new int[256];
	int maxfrq=0;
	
	for(int i=0;i<length;i++)
	{
		count[str.charAt(i)]++;
		
		if(count[str.charAt(i)]>maxfrq)
		{
			maxfrq=count[str.charAt(i)];
			ans=str.charAt(i);
		
		}
	}
	return ans;
	
	}
	
}
