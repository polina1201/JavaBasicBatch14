package GroupProject1;

public class Task7 {

	public static void main(String[] args) {
		//Write a java program to check whether a given number is prime or not? - INTERVIEW QS
		
		int num=15;
		boolean isPrime=true;
		if(num>1) {
			
			//from here until break you can still get the prime or not prime number answer
			for(int i=2; i<num;i++) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}
			
		}else {
			isPrime=false;
		}
		if(isPrime) {
			System.out.println(num+" is Prime");
		}else {
			System.out.println(num+" is not Prime");
		}

	}

}
