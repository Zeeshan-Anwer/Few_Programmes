package test.arraylist;

import java.util.Objects;

public class Student implements Comparable<Student> {
	
	private int rollno;
	private String name;
	private int marks;
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public int hashCode() {
		return rollno;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student s=(Student)obj;
		return this.rollno==s.rollno;
			 
	}
	@Override
	public int compareTo(Student o) {
		
		if(this.marks > o.marks)
			return -1;
		else if(this.marks <o.marks)
			return +1;
		else
			return 0;
		
		
	}
	
	
}
