package bronze2;

import java.util.Arrays;
import java.util.Scanner;

public class Q2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N];
		
		for (int i = 0; i < N; i++) {
			 num[i] = sc.nextInt();			
		}
		Arrays.sort(num);
		
		for (int j = 0; j < N; j++) {
			System.out.println(num[j]);
		}
	}
}
