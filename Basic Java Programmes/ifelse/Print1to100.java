package ifelse;

public class Print1to100 {
	
	public void meth1(int a,final int b)
	{
		
		if (a==101) 
			return;
	
		if(a<=100)
			System.out.println(a);
		this.meth1(a+1,100);
	}
	void meth2() {
		System.out.println("Zeeshan");
		System.out.println("Anwer");
		System.out.println("Bye");
	}

	public static void main(String[] args) {
		new Print1to100().meth1(1,100);
	
		

	}

}
