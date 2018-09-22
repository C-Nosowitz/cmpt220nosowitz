import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int even = 0;
		int odd = 0;
		int count = 0;
		double total = 0;
		
		System.out.println("Enter an integer, the input ends if it is 0: ");
		int number = input.nextInt();
		
		if(number == 0) {
			System.out.println("No numbers are entered except 0");
			System.exit(1);
		}
		
		while (number != 0) {
			if (number % 2 ==0)
				even++;	
			else
				odd++;	
			total += number;	
			count++;				
			number = input.nextInt();
		}

		double average =  (float) total / count;

		System.out.println(
			"The number of evens is " + even +
			"\nThe total is total " + total +
			"\nThe average is " + average);
	}


}


