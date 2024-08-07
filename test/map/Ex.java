package test.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex {
	
	public static void main(String[] args) {
		
		Map<String,Student> m=new HashMap();
		m.put("MH", new Student(1,"Zeeshan",34));
		m.put("Hryana",new Student( 2,"Shadab",342));
		
		Set<String> st=m.keySet();
		Collection<Student> s=m.values();
		
		List<Student> std=new ArrayList(s);
		
		Set<Map.Entry<String, Student>> c=m.entrySet();
		
		for(Entry<String,Student> dc:c) {
			dc.getKey();
			dc.getValue();
			
		}
	}

}
