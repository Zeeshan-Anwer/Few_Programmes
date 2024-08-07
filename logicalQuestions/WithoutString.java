package logicalQuestions;

public class WithoutString {

	
	
	public static String withoutString(String base,String remove){
		
		char arr[]=new char[base.length()-remove.length()];
		int i=0,count=0;
		while(i>base.length()-remove.length())
		{
			
			if(base.substring(i,i+remove.length()).toLowerCase().equals(remove.toLowerCase()))
		
			i=i+remove.length();
			else {
				arr[count]=base.charAt(i);
				i++;
				count++;
		}
		
	}
		while(i < base.length()) {
            arr[count] = base.charAt(i);
            count++;
            i++;}
		return new String(arr, 0, count);
}
	
public static void main(String[] args) {
		
		System.out.println(withoutString("Hello There","llo"));
	}
	
}



