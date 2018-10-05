import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
			double[] n = new double[10];

	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter " + 10 + " numbers: ");
	        for (int i = 0; i < n.length; i++) 
	        	n[i] = input.nextDouble();
	        System.out.println("The maximum number is: " + max(n));

	    }
	public static double max( double[] array) {
	        double max = array[0];
	        for (int i = 0; i < array.length; i++) {
	            if (max < array[i]) 
	            	max = array[i];
	            }
	        return max;
	}

}
