package java8;

import java.util.Optional;

public class AllMethod {

	public static void main(String[] args) {
		Sum s=()->{
	};
	s.sum();
	
	Sub ss=(a,b)->{
		int c=a-b;};

	ss.sub(10,4);

	
	Mul m=(a)-> {return a;
};



Check c=(name)->{
	return "Hello" +name;
};

System.out.println(c.wish("Zeeshan"));
}
	
	
}