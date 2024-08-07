package test.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ArryList {
	
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList();
		//List<String> al=new LinkedList();
		System.out.println("Answer: "+al.add(null));
		al.add(null);
		al.add("Zeeshan");
		al.add("Sahdab");
		al.add("Anwer");
		al.add("Hyphen");
		al.trimToSize();
		al.contains("Sahdab");
		System.out.println(al.indexOf("Anwer"));
	
		
		List<Integer> id=Arrays.asList(1,2,3,4,5,6);
		
		
		
		Collections.synchronizedList(al);
		System.out.println(al);
		
//		Iterator itr=al.iterator();
//		while(itr.hasNext()) {
//			if(itr.next()=="Zeeshan") {
//				itr.remove();
//			}
//		}
		HashSet<String> hs=new HashSet(al);
		
		
		al=new ArrayList( hs);
		System.out.println("hs"+al);
		//System.out.println(al);
//		String a=al.get(2);
//		Object as[]=al.toArray();
//		al.indexOf("Zeeshan");
}
}
