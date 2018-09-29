import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int [] values = new int[26];
		int input1;
		int count = 0;
		System.out.println("Enter a string: ");
		do
		{
			input1 = input.nextInt();
			values[count] = input1;
			count += 1;
		}
		
		while (input1 != 0);
		
		countOccurence(values);
	}

		
		public static void countOccurence(int[] list) {
	        for (int i = 1; i <= 26; i++) {
	            int count = 0;
	            for (int j = 0; j < list.length - 1; j++) {
	                if (list[j] == i)
	                    count += 1;

	            }
	            if (count != 0)
	                System.out.printf("%d occurs %d %s%n", 
	                    i, count, count > 1 ? "times" : "time");
	        }
	}
}
		
		