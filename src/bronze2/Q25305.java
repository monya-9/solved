package bronze2;

import java.util.Scanner;

public class Q25305 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] x = new int[N];

		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();

		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (x[j] < x[i]) {
					int temp = x[j];
					x[j] = x[i];
					x[i] = temp;
				}
			}
		}
		for (int i = 0; i < 1; i++) {
			System.out.println(x[K - 1]);
		}

	}
}
