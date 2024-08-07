package staticprac;

public class ClassC {

	static int x=m1();
	public static void main(String[] args) {
		
		System.out.println(ClassC.x);
	}
	
	static 
	{
		System.out.println("X :--"+x);
		ClassC.x=x+20;
	}
	static int m1()
	{
		ClassC.x=50;
		return m2();
	}
	
	static int m2()
	{
		System.out.println("X :--"+ClassC.x);
		return 100;
	}
	

}
