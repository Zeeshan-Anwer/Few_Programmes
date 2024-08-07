package test.arraylist;

import java.util.TreeSet;

public class TreeSeet {
	
	public static void main(String[] args) {
		
		TreeSet<Student> t=new TreeSet();
		
		t.add(new Student(1,"Zeehan",34));
		t.add(new Student(2,"Shadab",56));
		
		
		System.out.println(t);
		
	}

	
}
