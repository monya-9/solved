package bronze2;

import java.util.Scanner;

public class Q10813 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] n = new int[N+1];
		
		for (int i = 1; i < n.length; i++) {
			n[i] = i;
			
		}
		for (int i = 0; i < M; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			int tmp = n[A];
			n[A] = n[B];
			n[B] = tmp;
		}
		
		for (int i = 1; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
	}
}
