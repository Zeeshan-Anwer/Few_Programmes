package test.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Toppers {
	
	public static void main(String[] args) {
		
		Map<String,Student> entry=new HashMap();
		entry.put("MH", new Student(1,"Zeeshan",299));
		entry.put("Hyan", new Student(2,"Shadhab",300));
		entry.put("punjav", new Student(4,"Anwer",350));
		entry.put("kashir", new Student(3,"Ali",2520));
		entry.put("arunacha", new Student(5,"Pathan",400));
		
		Set<Map.Entry<String, Student>> details=entry.entrySet();
		
		
		
		System.out.println("State wise Topper Results");
		System.out.println("State wise Topper Results");
		
		
		for(Map.Entry<String, Student> me:details)
		{
		
			System.out.println("*********************");
			
			System.out.println("State: "+me.getKey());
			
			Student s=me.getValue();
			
			System.out.println("Name: "+s.getName());
			System.out.println("Marks: "+s.getMarks());
			System.out.println("Roll: "+ s.getRoll());
			
//			 List<Map.Entry<String, Integer> > list =
//		               new LinkedList<Map.Entry<String, Integer> >(entry.entrySet());
//		 
//	//		getSortByValue(entry);
		}
		
		
	}
	 
		
	}

