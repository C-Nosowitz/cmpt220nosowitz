
public class Problem2 {

	public static void main(String[] args) {
		int Count = 1;

        for (int i = 100; i <= 500; i++) {



            if (i % 5 == 0 ^ i % 7 == 0)

                System.out.print((Count++ % 10 != 0) ? i + " " : i + "\n");

        }
	}

}
