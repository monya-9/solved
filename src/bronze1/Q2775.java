package bronze1;

import java.util.Scanner;

public class Q2775 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();

			System.out.println(fib(k, n));
		}
	}

	private static int fib(int k, int n) {
		if (k == 0)
			return n;
		if (n == 0)
			return 0;
		else
			return fib(k, n - 1) + fib(k - 1, n);
	}
}
