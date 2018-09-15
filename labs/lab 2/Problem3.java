import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.print("Enter a lower limit integer: ");
		num1 = input.nextInt();
		
		System.out.print("Enter an upper limit integer: ");
		num2 = input.nextInt();
		
		for (int i = 1; i <= 3 ; i++)
	       {
	        int Random = (int)(Math.random()*100);
	        System.out.println(Random);
	       }
	}

}
