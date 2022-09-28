package bronze3;

import java.util.Scanner;

public class Q2720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int C = sc.nextInt();

			int Q = C / 25;
			C = C % 25;
			int D = C / 10;
			C = C % 10;
			int N = C / 5;
			C = C % 5;
			int P = C / 1;
			C = C % 1;
			
			System.out.println(Q + " " + D + " " + N + " " + P);
		}
	}
}
