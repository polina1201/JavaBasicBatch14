package GroupProject1;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// Using Scanner create an array of countries. When an array is create, retrieve all
		//values from it and while retrieving those values, print capital for 
		//each country (use 2 different loops)

		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter how many countries you want to store");
		int size=scanner.nextInt();
		
		//two arrays one to store the countries and the other one to store the capitals
		String[]countries=new String[size];
		String[]capitals=new String[size];
		
		//This is to consume that extra enter that we will be getting from line number 16
		scanner.nextLine();
		
		
		for (int i=0; i<size; i++) {
			System.out.println("Please Enter the country name");
			countries[i]=scanner.nextLine();
			
			System.out.println("Please Enter the capital for "+countries[i]);
			capitals[i]=scanner.nextLine();
		}
		//Prints the arrays in a good format
		System.out.println(Arrays.toString(countries));
		System.out.println(Arrays.toString(capitals));
		
		for (int i=0; i<size; i++) {
			System.out.println("The Country "+countries[i]+" Has the capital "+ capitals[i]);
		}
	}

}
