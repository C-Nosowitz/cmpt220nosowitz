import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		double i = input.nextDouble();
		System.out.print("Enter the second number: ");
		double j = input.nextDouble();
		System.out.print("Enter the third number: ");
		double k = input.nextDouble();
		
		System.out.print("The average is: " + average(i, j, k));
		
		

	}
	
	public static double average(double a, double b, double c) {
		double result;
		
		result = (a+b+c) / 3;
		
		return result;
	}
}
