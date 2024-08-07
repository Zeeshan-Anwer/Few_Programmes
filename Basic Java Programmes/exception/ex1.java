package exception;

public class ex1 {
	
	static void m1(int a) {
		System.out.println("the value of a"+a);
	}
	
	static void m2() {
		m1(10);
	}
	public static void main(String[] args) {
		
		int pr=ex1.m2();	//fact intresting
		System.out.println(pr);

	}

}
