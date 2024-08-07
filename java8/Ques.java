package java8;

import java.util.ArrayList;

public class Ques {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList();
		
		al.add(1);
		al.add(2);
		al.add(3);
		
		al.forEach(System.out::println);		//This one
	}

}
