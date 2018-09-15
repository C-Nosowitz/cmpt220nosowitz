import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.print("Enter the first number: ");
		num1 = input.nextInt();
		
		System.out.print("Enter the second number: ");
		num2 = input.nextInt();
		
		System.out.print(num1 + " is LESS THAN " + num2 + "? ");
		System.out.println(num1 < num2);
		System.out.print(num1 + " is LESS THAN OR EQAUL TO " + num2 + "? ");
		System.out.println(num1 <= num2);
		System.out.print(num1 + " is GREATER THAN " + num2 + "? ");
		System.out.println(num1 > num2);
		System.out.print(num1 + " is GREATER THAN OR EQUAL TO " + num2 + "? ");
		System.out.println(num1 >= num2);
		System.out.print(num1 + " is EQUAL TO " + num2 + "? ");
		System.out.println(num1 == num2);
		System.out.print(num1 + " is NOT EQUAL TO " + num2 + "? ");
		System.out.println(num1!= num2);
	}

}
