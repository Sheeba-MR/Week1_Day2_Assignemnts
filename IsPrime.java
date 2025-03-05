package week2.day2;

public class IsPrime {

	public static void main(String[] args) {
		
			int n = 12;
			for (int i = 2; i < n; i++) {
				if (n%i == 0) {
					System.out.println(i+" is not a prime number");
				}
				else {
					System.out.println(i+" is a prime number");
				}
			}
			
						
		

	}

}
