package ifelse;

import java.util.Scanner;

public class Vaccinate {

	public static void main(String[] args) {

		int P_age=20;
		boolean V_dose=true;


	}
	void vaccineEligibilityCheck(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age");
		int age=sc.nextInt();
		boolean dose1=true;
		
		if(age>18 & dose1==true)
			System.out.println("You are eligible for 2nd dose");
		else if(age>18)
			System.out.println("You are eligible for 1st dose");
		else
			System.out.println("You are not eligible");	
		
	}

}
