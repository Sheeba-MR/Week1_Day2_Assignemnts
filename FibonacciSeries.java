package week2.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 1;
		for (int i = 0; i <= 8; i++) {
			System.out.println(a+" ");
			int c = a+b;
			a = b;
			b = c;
		}
			
			
		
	}

}
