package stringQues;

public class PrintDup {

	public static void main(String[] args) {
		
	
	String s="dkfakldf";
	
	for(int i=0;i<s.length();i++)
	{
		for(int j=0;j<s.length();j++) {
			if(s.charAt(i)==s.charAt(j))
				break;
		}
		
	}
}

}