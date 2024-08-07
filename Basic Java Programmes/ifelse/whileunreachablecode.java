package ifelse;

public class whileunreachablecode {

	public static void main(String[] args) {

		while(true)
		{
			System.out.println("Hello");
			
		}
		System.out.println("Bye"); //unreachable code error example
		//never accesable due to condition always true
	}

}
