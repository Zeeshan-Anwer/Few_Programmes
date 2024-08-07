package test.arraylist;

import java.util.LinkedList;

public class Linkedlst {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> ls=new LinkedList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(30);
		ls.add(null);
		
		for(Integer i:ls) {
			System.out.println(i);
		}
	}
	
}
