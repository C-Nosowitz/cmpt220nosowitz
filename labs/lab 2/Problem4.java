import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in);
		
		System.out.print("Enter first character: ");
		char character = input.next().charAt(0);
		
		System.out.print("Enter second character: ");
		char character1 = input.next().charAt(0);
		
		System.out.print("The result is: " + (character + character1));
		
		
		
		
	}

}
