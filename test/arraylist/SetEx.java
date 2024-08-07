package test.arraylist;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {
	
	public static void main(String[] args) {
		
		Set<Integer> s=new LinkedHashSet();
		
		s.add(null);
		//s.forEach(x->System.out.println(x));
		
		Set<Integer> tree=new TreeSet();
		tree.add(5);
		tree.add(2);
		tree.add(3);
		tree.add(4);
		tree.add(5);
		tree.add(1);
		
		tree.forEach(x->System.out.println(x));
	}

}
