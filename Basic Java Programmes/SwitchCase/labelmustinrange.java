package SwitchCase;

public class labelmustinrange {

	public static void main(String[] args) {
		
		
		byte b=10;
		char d='A';
	
	
	switch(b+10) {
	
		case 10:
			System.out.println("Hello it works fine because 110 is in range");
			break;
		case 130;
		System..out.println("Error Because not in byte range");
		case 'a':
			System.out.println("Works fine because compile time constant");
		case d+5:
			System.out.println("Getting error because c variable can be changed. "
					+ "To Overcome this problem declare c variable as final");
			
		}

	}

}
