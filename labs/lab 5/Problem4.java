import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		 	int[][] x1 = new int[3][3];
	        int[][] x2 = new int[3][3];
	        
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter list 1: ");
	        for (int i = 0; i < x1.length; i++)
	            for (int j = 0; j < x1[i].length; j++)
	                x1[i][j] = input.nextInt();

	        System.out.print("Enter list 2: ");
	        for (int i = 0; i < x2.length; i++)
	            for (int j = 0; j < x2[i].length; j++)
	                x2[i][j] = input.nextInt();



	        if (equals(x1, x2)) {
	            System.out.println("The two arrays are identical.");
	            
	        } else {
	            System.out.println("The two arrays are not identical");

	        }

	    }



	    public static boolean equals(int[][] x1, int[][] x2) {
	        if (x1.length != x2.length || x1[0].length != x2[0].length)
	        	
	        	return false;


	        for (int i = 0; i < x1.length; i++) {
	            for (int j = 0; j < x1[i].length; j++) {
	                if (x1[i][j] != x2[i][j]) return false;
	            }
	        }
	        return true;
	}

}
