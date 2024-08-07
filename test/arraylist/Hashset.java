package test.arraylist;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;

public class Hashset {


	public static void main(String[] args) {
		
//		HashSet<String> hs=new HashSet();
//		hs.add("Zeesahn");
//		hs.add("Zeeshan");
//		hs.add("Shadab");
//		hs.add("Dilshad");
//		hs.add(null);
//		
//		System.out.println(hs);
//		System.out.println(hs.contains("Sahdab"));
		
		Student s1=new Student(1,"Zeeshan",56);
		Student s2=new Student(1,"Shadab",58);
		Student s3=new Student(1,"Anwer",56);
		
		HashSet<Student> hs=new HashSet(10);
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println(hs);
	}

}
