package java8;

public class Implementation1 {

	public static void main(String[] args) {
		
		Sum s= () -> System.out.println("Do Sum");
		s.sum();
		Sub su=(a,b)->System.out.println(a-b);
		su.sub(50, 40);
		Mul m= (a)-> (a*a);
		int a=m.mul(5);
		System.out.println(a);

	}

}
