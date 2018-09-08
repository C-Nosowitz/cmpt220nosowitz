import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter value for ounces: ");
		double ounces = input.nextDouble();
		
		double grams = (ounces * 28.35);
		System.out.println(+ ounces + " Ounces is " + grams + " in grams");
}
}
