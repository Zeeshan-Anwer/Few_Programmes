package test.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ALEx {
	
	public static void main(String[] args) {
		
	
	
	List<Integer> al=Arrays.asList(10,20,30,40,50);
	al.indexOf(10);
	al.isEmpty();
	al.set(0, null);
	al.clear();
	al.get(3);
	Object[] obj=al.toArray();
	Iterator itr=al.iterator();
	while(itr.hasNext()) {
		itr.next();
		itr.remove();
		System.out.println();
	}
	ListIterator li=al.listIterator();
	while(li.hasNext())
	{
		li.next();
		li.add(5);
		li.remove();
		li.forEachRemaining(x->System.out.println(x));
		li.nextIndex();
		li.previous();
		li.previousIndex();
		li.hasPrevious();
	}
	for(Integer x:al)
		System.out.println(x);
	
	al.forEach(x->System.out.println(x));
	al.forEach(x->System.out.println(x));
	
	Collections.synchronizedList(al);
	}
}
