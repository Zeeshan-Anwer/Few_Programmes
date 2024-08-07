package java8;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamGo {
	
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList();
		
		al.add("Zeeshan");
		al.add("Shadab");
		al.add("Arman");
		
		Stream str=al.stream();
		str.filter(i->i.equals(Zeeshan)).forEach(System.out::print);
	}

}
