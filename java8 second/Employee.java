package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Employee {

	private String name;
	
	public Employee(String name) {
		this.name=name;
	}
	
	public void setName() {
		this.name=name;
	}
	
	public String getName(String name) {
		return name;
	}


	public class TestFunctionaInterfaces {
	
	public static void main(String[] args) {
		Predicate<String> predicateFunc= t->t.length()>5;
		System.out.println(predicateFunc.test("Praveen"));
		
		List<String> l=new ArrayList<>();
		l.add("Gyan");
		l.add("Rohit");
		l.add("Praveen");
		
		System.out.println("filtered");
		
	}
}

}