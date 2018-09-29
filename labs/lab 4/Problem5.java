
public class Problem5 {

	public static void main(String[] args) {
		int[] numbers = new int[1000];
		int sum = 0;
		for(int i = 0; i < 1000; i++) {
			int Random = (int)(Math.random());
	        System.out.println(Random);
			sum += numbers[i];
		}
		
		double average = (double)sum / 1000;
		
		int count = 0;
		for (int i = 0; i < 1000; i++)
			if (numbers[i] > average)
				count++;
		int count1 = 0;
		for(int i = 0; i < 1000; i++)
			if(numbers[i] < average)
				count1++;

		System.out.println("The average is " + average);
		System.out.println("There are " + count1 + " numbers below the average.");
		System.out.println("There are " + count + " numbers above the average.");
	}

}
