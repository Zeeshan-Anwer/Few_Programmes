package test.arraylist;

import java.util.Stack;
import java.util.Vector;

public class StackEx {
	
	public static void main(String[] args) {
		
		Stack<String> st=new Stack();
		st.push("Zeshan");
		
		System.out.println(st.peek());
	System.out.println(	st.pop());
	Vector<String> v=st;
	v.indexOf("Zeshan");
	}

}
