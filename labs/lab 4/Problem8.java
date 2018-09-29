import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter list (The first number indicates the number of elements in the list): ");
		int n = input.nextInt();
		int[] list = new int [n];
		
		for(int i = 0; i < list.length; i++){
			list[i] = input.nextInt();
		}
		
		if (isSorted(list)) { 
			System.out.print("The list is already sorted.\n");
		}
        else 
        	System.out.print("The list is not sorted. The sorted list is: \n");

	
		selectionSort(list);
	
		for (double e: list) 
			System.out.print(e + " ");

		
}
	public static boolean isSorted(int[] list) {
			int n = list.length - 1;
			boolean isSorted = true;
			
			for (int i = 0; i < n; i++) {
				   if (list[i] > list[i + 1]) {
				    isSorted = false;
				    break;
				   }
				  }
				 
				  return isSorted;

	}
		public static void selectionSort(int[] list) {
			for (int i = list.length - 1; i >= 0; i--) {	
				double currentMax = list[i];
				int currentMaxIndex = i;
				
				for (int j = i - 1; j >= 0; j--) {
					if (currentMax < list[j]) {
						currentMax = list[j];
						currentMaxIndex = j;

					}

				}	
				if (currentMaxIndex != i) {
					list[currentMaxIndex] = list[i];
					list[i] = (int) currentMax;
				}
			}
		}
}

				

			



