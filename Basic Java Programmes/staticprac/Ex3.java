package staticprac;

public class Ex3 {
	
	static int i=10;
	static 
	{
		display();
		System.out.println("first Static block" +i);
		
	}
	Ex3()
	{
		System.out.println("This is static flow");
		
	}
	
	

	public static void main(String[] args) {
		
		display();
		System.out.println("Main Method");
	}
	static void display()
	{
		System.out.println("This is display mehod");
		
	}
	static int j=20;
	static 
	{
		new Ex3();
		System.out.println("Second static block"+j);
	}
	//static int j=20;

}
