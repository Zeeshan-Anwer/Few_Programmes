package test.arraylist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class al {
	
	public static void main(String[] args) {
		
		List<Integer> a=Arrays.asList(10,20,30,40);
		
		ListIterator li=a.listIterator();
		while(li.hasNext()) {
			li.forEachRemaining(x-> System.out.println(x));
		}
		
	
	}
	


}
