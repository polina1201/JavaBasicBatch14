package GroupProject1;

public class Task3 {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of all numbers
		
		
		int[][]arr= {
				
				{10, 10,10, 20},
				{25,40, 54},
				{20,40}
		};
		int sum=0;

		for(int[]ar:arr) {
			for(int num:ar) {
				sum+=num;
			}
		}
		System.out.println(sum);
	}

}
