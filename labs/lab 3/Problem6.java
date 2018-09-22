import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String s = input.next();
		
		System.out.print("The number of vowels is: " + countVowel);
		

	}
	
	public static countVowel (String strName) {
		int count = 0;
		
		for (char c ;;) {
			switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			count++;
			break;
			}
		}
		return count;
	}

}
