package week2.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 121;
		int reverse = 0;
		int temp = i;
		
		while (temp > 0) {
			int reminder = temp%10;
			reverse = (reverse*10)+reminder;
			temp = temp/10;
			
		}
		if (i==reverse) {
			System.out.println("Palindrome");
			
		}
		else {
			System.out.println("Not a Palindrome");
		}

	}

}
