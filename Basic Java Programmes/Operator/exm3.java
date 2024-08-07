package Operator;

public class exm3 {

	public static void main(String[] args) {
		
		int a=23;
		int b=21;
		int c=a++ + ++b;
		int d=--a + --b + c--;
		int e= a + +b + +c + d--;
		int f=-a + b-- +-c - d++;
		int sum=a + b +c +d +e +f;
		
		
		System.out.println("sum= "+sum);
		
		
	}

}
