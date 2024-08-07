package ifelse;

public class IntCharCompatibility {
	
	int comp() {
		return 'A'; // here A is compatible with int 
	}

	public static void main(String[] args) {
		
		System.out.println( new IntCharCompatibility().comp());
	}

}
