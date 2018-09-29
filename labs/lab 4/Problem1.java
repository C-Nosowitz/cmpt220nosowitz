
public class Problem1 {

	public static void main(String[] args) {
		System.out.println("\nInches  Centimeters |   Centimeters   Inches \n" + 
				   "----------------------------------------------");

		for (double inches = 1.0, centimeters = 1.0; inches <= 50.0; inches++, centimeters += 5) {
				System.out.printf("%4.1f     ", inches);
				System.out.printf("%6.3f", inchToCentimeter(inches));
				System.out.print("     |     ");
				System.out.printf("%-11.1f", centimeters);
				System.out.printf("%7.3f\n", centimeterToInches(centimeters));
		}
}


	public static double inchToCentimeter(double inch) {
		return inch * 2.54;
}

	public static double centimeterToInches(double centimeter) {
		return centimeter * .39;
}




	}


