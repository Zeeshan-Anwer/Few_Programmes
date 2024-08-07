package java8;

public class Implementation {

	public static void main(String[] args) {
		
		
		Sum s= ()->System.out.println("Sum Executed");
		
		Sub s2=(a,b)->System.out.println(a-b);
		s2.sub(10, 5);

		Mul m1=(a)->{return (a*a);};
		m1.mul(5);
	}

}
