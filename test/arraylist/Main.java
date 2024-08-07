package test.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		
		
		TreeSet<Employee> emps=new TreeSet(new ComparatorName());
		emps.add(new Employee(1,"Zeeshan",1000));
		emps.add(new Employee(2,"Shadab",2000));
		emps.add(new Employee(3,"Dilshad",2000));
		emps.add(new Employee(4,"Imtiyaz",3000));
		emps.add(new Employee(5,"Khan",4000));
		
		//System.out.println(emps);
		
		
		
		
	}

}
