package xPracticeAtHome;

public class ReviewNotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (System.out.println("1"); true; System.out.println("3")) {
			System.out.println("2");
		}

		System.out.println("------");
		
		
		   for (int h = 0; h <= 23; h++) {

	            for (int m = 0; m <= 59; m++) {

	                if (h <= 9 && m <= 9) {
	                    System.out.println("0" + h + ":" + "0" + m);

	                } else if (h <= 23 && m <= 9) {
	                    System.out.println(h + ":" + "0" + m);

	                } else if (h <= 9 && m >= 10) {
	                    System.out.println("0" + h + ":" + m);

	                } else {
	                    System.out.println(h + ":" + m);
	                }

	            }
	        }
		
		
	}

}
