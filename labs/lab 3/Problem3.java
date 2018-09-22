
public class Problem3 {

	public static void main(String[] args) {
		for (int i = 1, count = 1; i <= 100; i++) {

            System.out.print((count++ % 20 != 0) ? (char)i + " " : (char)i + "\n");
		}

	}
}
