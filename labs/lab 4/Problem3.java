import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = input.next();
		System.out.println(s + (isPalindrome(s) ? " is " : " is not ") +
				"a palindrome.");
		
		
	}
		
		public static boolean isPalindrome(String s) {
			return s.equals(reverse(s)) ? true : false;
		}
			
		public static String reverse(String s) {
			String reverse = ""; 	
			String n = s + ""; 
			
			for (int i = n.length() - 1; i >= 0; i--) {
				reverse += n.charAt(i);
			}
			return String.valueOf(reverse); 
		}
	}


