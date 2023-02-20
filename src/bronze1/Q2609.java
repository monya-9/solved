package bronze1;

import java.util.Scanner;

public class Q2609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		System.out.println(gcd(A, B));
		System.out.println(A*B/gcd(A, B));
	}

	public static int gcd(int p, int q) {
		if (q == 0)
			return p;
		return gcd(q, p % q);
	}
}
