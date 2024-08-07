package staticprac;

public class ClassA {
	
	static int x=m1();


	public static void main(String[] args) {
	
		System.out.println(ClassA.x);

	}
	static 
	{
		System.out.println(x);
		ClassA.x=x+20;
		
	}
	static int m1()
	{
		ClassA.x=50;
		return m2();
	}
	static int m2()
	{
		System.out.println(ClassA.x);
		return 100;
	}
	

}
