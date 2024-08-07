
public class A {
	
	public static void main(String[] args) {
		
		int i,j,length=0,temp=0;
		String s="abcabcbb";
		for(i=0;i<s.length();i++) {
			for(j=i+1;j<s.length();j++) {
				if(i<s.length())
					break;
				if(s.charAt(i)==s.charAt(j))
				{
					temp=j-i;
					if(length<temp)
						length=temp;
				}
			}
		}
		System.out.println(length);

	}

}
