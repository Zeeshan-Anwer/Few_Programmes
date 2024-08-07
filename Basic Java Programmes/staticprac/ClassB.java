package staticprac;

public class ClassB {
	
	static int x=10;
	static int y=20;
	int z=80;
	static {
		System.out.println("---Test11 SB1 called--");
		System.out.println("X :--"+x);
		System.out.println("Y :--"+y);
	}
	
	static void m1()
	{
		int x=100;
		System.out.println("Static method called");
		System.out.println("X :--"+x);
		System.out.println("Y :--"+y);
	}
	

	public static void main(String[] args) {
		
		m1();
		
	}

	static 
	{
		System.out.println("Test11 SB2 called+===");
		System.out.println("X :--"+x);
		System.out.println("Y :--"+y);
	}
}
