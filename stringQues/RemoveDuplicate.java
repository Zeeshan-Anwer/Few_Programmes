package stringQues;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		String str="abccbagdgkl";
		
		
	}

	public static void removeDup(String str) {
		int j;
		char arr[]=new char[str.length()];
		
		for(int i=0;i<str.length();i++) {
			
			for(j=0;j<str.length();j++)
				if(i!=j)
			{
				if(str.charAt(i)==str.charAt(j))
					break;
				
			}	
			
		}
		
			
	}
}
