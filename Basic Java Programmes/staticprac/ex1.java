package staticprac;

public class ex1 {
	static int a=0;
	int b=0;
	ex1()
	{
		
		a++;
		b++;
		System.out.println("Static variable===>"+a);
		System.out.println("Instance variable===>"+b);
		System.out.println("-------");
		
	}
	void display()
	{
		System.out.println("**************Accessubg static variable*******");
		System.out.println(a);
		System.out.println(ex1.a);
		System.out.println(new ex1().a );
	}

	public static void main(String[] args) {

		new ex1();
		new ex1();
		new ex1();
		System.out.println("########################");
		new ex1().display();
		

	}

}
