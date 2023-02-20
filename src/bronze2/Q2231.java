package bronze2;

import java.util.Scanner;

public class Q2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str_N = sc.nextLine();

		int N_len = str_N.length();

		int N = Integer.parseInt(str_N);
		int result = 0;

		for (int i = (N - (N_len * 9)); i < N; i++) {
			int number = i;
			int sum = 0;

			while (number != 0) {
				sum += number % 10;
				number /= 10;
			}
			
			if (sum + i == N) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
}
