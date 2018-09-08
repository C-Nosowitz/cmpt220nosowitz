import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a mass, in kilograms: ");
		double kilograms = input.nextDouble();
		
		double a = 299972458;
		double b = 2.0;
		System.out.print("The amout of energy is: " + (kilograms*Math.pow(299972458, 2.0)));
		
	}

}
