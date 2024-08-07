package test.map;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DeleteExMap {
	
	public static void main(String[] args) {
		
		Map<Integer,String> codes=new HashMap();
		codes.put(200, "Suceess");
		codes.put(404,"Resource Not Found");
		codes.put(400,"Bad Request");
		codes.put(201,"Created");
		codes.put(401,"UnAuthorize");
		codes.put(500,"Internal Server Error");
		
		Set<Integer> allKeys=codes.keySet();
		
		allKeys.forEach(x->
		System.out.println("Keys: "+x));
		
		Collection<String> allValues=codes.values();
		allValues.forEach(x->System.out.println(x));
		
		Set<Map.Entry<Integer, String>> entry=codes.entrySet();
		for(Map.Entry<Integer,String> e:entry) {
			System.out.println(e.getKey()+e.getValue());
		}
		
	}

}
