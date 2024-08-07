
public class Solution {

	public static void main(String[] args) {
		
		String word="abcabcbb";
		int count=0;
		int n=3;
		for(int i=0;i<word.length();i++)
		{
			String sub=word.substring(i,i+n);
			for(int j=i+n;j<word.length();j++)
			{
				if(sub.equals(word.substring(j,j+n)))
{
		System.out.println(sub.length());
}
			}
		}
	}
}
