package bronze2;

import java.util.Scanner;

public class Q3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = 42;
		int[] B = new int[10];
		int cnt = 0;
		int n = 0;
		
		for (int i = 0; i < B.length; i++) {
			B[i] = sc.nextInt();
			B[i] %= A;
		}
		for (int i = 0; i < B.length; i++) {
			cnt = 0;
			for (int j = i+1; j < B.length; j++) {
				if(B[i] == B[j] && i != j) {
					cnt++;
					break;
				}
			}
			if(cnt == 0 ) {
				n++;
			}
		}
		System.out.println(n);
	}
}
