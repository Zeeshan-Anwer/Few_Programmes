package test.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentUtils {
	
	public static void main(String[] args) {
		
		ArrayList<Student> st=input();
		//System.out.println(st.toString());
		
//		Iterator<Student> itr=st.iterator();
//		while(itr.hasNext()) {
//			Student s=itr.next();
//			System.out.println(s);
//			itr.remove();
//			}
//		System.out.println(st.isEmpty());
		
		
		
	}
	
	public static ArrayList input() {
		
		char opt='y';
		ArrayList<Student> st=new ArrayList();
		Scanner sc=new Scanner(System.in);
		do
		{
			Student s=new Student();
			System.out.println("Enter name,roll,marks");
			s.setName(sc.next());
			s.setMarks(sc.nextInt());
			s.setRollno(sc.nextInt());
			st.add(s);
			System.out.println("Enter 'y' or 'n'");
			opt=sc.next().charAt(0);
		}
		while(opt=='y')	;
		return st;
	}
	
	

}
