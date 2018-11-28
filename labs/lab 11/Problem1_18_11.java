import java.util.Scanner;

public class Problem1_18_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        long n = input.nextLong();
        System.out.println("The sum is: " + sumDigits(n));

    }

    public static long sumDigits(long n) {

        if (n == 0)
            return n;

        return n % 10 + sumDigits(n / 10);
    }

}


