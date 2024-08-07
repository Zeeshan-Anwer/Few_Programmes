package test.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachMehtod {
	
	public static void main(String[] args) {
		
		List<Integer> al=Arrays.asList(10,20,30,48,50);
	
		al.forEach(x->System.out.println(x));
		
	}

}
