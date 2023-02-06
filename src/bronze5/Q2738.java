package bronze5;

import java.util.Scanner;

public class Q2738 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[N * M];
		int[] B = new int[N * M];

		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < B.length; i++) {
			B[i] = sc.nextInt();
		}
		for (int j = 1; j < A.length+1; j++) {
			System.out.print(A[j-1] + B[j-1] + " ");
			if(j % M == 0) {
				System.out.println();
			}
		}
	}
}
