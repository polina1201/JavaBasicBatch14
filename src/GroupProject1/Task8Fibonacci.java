package GroupProject1;

public class Task8Fibonacci {

	public static void main(String[] args) {
		/*Write a Java Program to print the first 10 numbers of
		 *Fibonacci series. 0 1 1 2 3 5 8 13 21
		 */

		
		
		int max=10;
		int previous=0;
		int next=1;
		
		System.out.print("Fibonacci Series of "+max+" numbers:");
		 
        for (int i = 1; i <= max; ++i)
        {
            System.out.print(previous+" ");
            /* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */

      
            int sum = previous + next;
            previous=next;
            next = sum;
            
            
            System.out.println("-------------------Another way");
            
         // Write a Java Program to print the first 10 numbers of Fibonacci series
            // 0 1 1 2 3 5 8 13 21
            
            int previous=0;
            int currentNumber=1;
            int nextNum=0;
            System.out.println(previous);
            System.out.println(currentNumber);
            for(int i=0; i<8;i++) {
                nextNum=previous+currentNumber;
                System.out.println(nextNum);
                previous=currentNumber;
                currentNumber=nextNum;
            
        }

		
	}

}
