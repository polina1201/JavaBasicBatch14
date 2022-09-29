package GroupProject1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1Scanner {

	public static void main(String[] args) {
		/*
		 * Using Scanner create an array of integer values After the array is created,
		 * calculate the sum of all stored elements in that array.
		 */

		Scanner input = new Scanner(System.in);

		
		System.out.println("Please enter number of elements");
		int elements = input.nextInt();//user created size of elements
		int[] arr = new int[elements];//creating array of the size user entered

		for (int i = 0; i < elements; i++){
		System.out.println("Please enter values");
		arr[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(arr)); 
			int sum = 0;
			{ for (int num:arr) 
			{sum+=num;}
		}
		
		System.out.println("The sum of all values entered is " + sum);

	}

}
