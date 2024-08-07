package java8;

public class Do {
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
		FI s=Do::add;
		s.show(2,3);
	}

}
