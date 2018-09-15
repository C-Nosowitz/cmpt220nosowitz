import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s1 = input.next();
		
		System.out.print("Enter another string:");
		String s2 = input.next();
		
		if (s1.compareTo(s2) < 0)
			System.out.println("The strings in alphabetical order are " +
					s1 + " " + s2);
		else
			System.out.println("The strings in alphabetical order are " +
					s2 + " " + s1);
		
		
		
		
	}

}
