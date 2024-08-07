
public class B {
	
	public String overlaping(String word,String search) {
		String Result=" ";
		int Count=0;
		for(int i=0;i<word.length()-search.length()-1;i++)
		{
			if(word.substring(i,i+search.length())).equals(search) && count<1)
{
	count++;
	Result+=word.substring(i,i+search.length())
			
}
else
{
	Result+=" "+word.charAt(i);
}
		}
		for(int i=0;i<word.length()-search.length();i++)
		{
			if(word.substring(i,i+search.length).equals(search) && count<1)
			{
				count++;
				Result+=" "+word.substring(i,i+search.length);
				i=i+search.length()-1;
				
			}
			else
			{
				Result+= " "+word.charAt(i);
			}
		}
		if(Result==null)
			System.out.println(word);
		else
			System.out.println(Result);
	}

}
