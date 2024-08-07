package test.arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LInkedhashsetexam {
	
	public static void main(String[] args) {
		
		String str="Zeeshaaan";
		System.out.println(removeDuplicate(str));
		List<String> cities=new ArrayList();
		
		cities.add("Patna");
		cities.add("Ranchi");
		cities.add("Bhagalpur");
		cities.add("Patna");
		
		cities.add("Bhagalpur");
		cities.add("Haryana");
		cities.add("Aara");
		
		System.out.println(removeDuplicateCities(cities));
	}

	private static List<String> removeDuplicateCities(List<String> cities) {
		
		Set<String> st=new LinkedHashSet(cities);
		List<String> al=new ArrayList(st);
		return al;
	}

	public static String removeDuplicate(String str) {
		
		char[] chr=str.toCharArray();
		
		StringBuilder ans=new StringBuilder();
		
		Set<Character> lh=new LinkedHashSet();
		
		for(char ch:chr) {
			lh.add(ch);
		}
		
		for(char ch:lh) {
			ans.append(ch);
		}
		
		return ans.toString();
	}

}
