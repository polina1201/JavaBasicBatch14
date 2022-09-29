package xPracticeAtHome;

import java.util.Scanner;

public class Repl42 {

	public static void main(String[] args) {

		Scanner Scanner = new Scanner(System.in);
		

		System.out.println("Enter the roll number of the Child");	
		int number=Scanner.nextInt();
		String name=null;

	

	switch (number) {
	
	case 101:
		name="Ramesh";
	break;
		
	case 102:
		name="Mahesh";
	break;
		
	case 103:
		name="Mukesh";
	break;
	
	default:
		name="Not found Studen name: in Class";
	}	
		System.out.println("Student name: "+name);
	
	
	
}
}