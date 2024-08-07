package ExecutionFlow;

public class breakcont {

	public static void main(String[] args) {
	
		for(int i=1;i<10;i++) {
			if(i==5)
				return;
			System.out.println(i);
		}

	}

}
