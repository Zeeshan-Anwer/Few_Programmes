package staticprac;

public class MainBlank {
	
	static int a=10;
	static {
		System.out.println(a);
		System.out.println(getB());
	}

	public static void main(String[] args) {
	

	}
	static int getB()
	{
		return b;
		
	}
	static int b=20;
}
