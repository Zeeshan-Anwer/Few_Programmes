package test;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayListIterate {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("One");
		al.add("Two");
		al.add("Three");
		al.add("Four");
		al.add("Five");
		al.add("Six");
		al.add("Seven");
		
		Iterator<String> itr=al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());

	}
		
			System.out.println(al);
		
		
		Iterator<String> itrr=al.iterator();
		while(itrr.hasNext())
			System.out.println(itrr.next());
			

}
}