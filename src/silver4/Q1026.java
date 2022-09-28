package silver4;

import java.util.Arrays;
import java.util.Scanner;

public class Q1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] A = new int[N];
		int[] B = new int[N];

		int mul = 0;
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);

		for (int i = 0; i < N; i++) {
			B[i] = sc.nextInt();

		}
		for (int i = 0; i < B.length; i++) {
			for (int j = i + 1; j < N; j++) {
				if (B[i] < B[j]) {
					int temp = B[j];
					B[j] = B[i];
					B[i] = temp;
				}
			}
			
			mul += A[i]*B[i];
		}
		System.out.println(mul);
	}
}
