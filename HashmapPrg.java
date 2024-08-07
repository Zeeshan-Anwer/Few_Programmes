package interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;

public class HashmapPrg {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> map=new HashMap();
		
		map.put(1, "Authorized");
		map.put(2, "Unauthorized");
		map.put(3,"No Value");
		
		 for(Integer key : map.keySet()) {
			 System.out.println(key  + " " +map.get(key));
		 }
		 
		 for(Map.Entry<Integer, String> entry : map.entrySet()) {
			 System.out.println(entry.getKey() +" :: " +entry.getValue());
		 }
		map.forEach((k,v) -> {
			System.out.println(k+  " " +v);
		});
	}

}
