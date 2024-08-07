package test.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMp {
	
	public static void main(String[] args) {
		
		Map<Integer,String> no=new HashMap();
		
		no.put(1, "One");
		no.put(2, "Two");
		no.put(null, "Dilsshad");
		no.put(null, "Shadab");
		no.put(5, null);
		no.put(6, null);
		
		
		Set<Integer> keys=no.keySet();
		
		for(Integer a:keys)
			System.out.println(a);
		
		Collection<String> value=no.values();
		
		
		
		for(String val:value)
			System.out.println(val);
		//System.out.println(no);
		
		
		Set<Map.Entry<Integer, String>> entries=no.entrySet();
		
		for(Map.Entry<Integer, String> pr:entries)
			System.out.println("Key: "+pr.getKey()+" Value: "+pr.getValue());
	}

}
