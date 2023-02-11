package bronze4;

import java.util.Arrays;
import java.util.Scanner;

public class Q25784 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] N = new int[3];

		for (int i = 0; i < N.length; i++) {
			N[i] = sc.nextInt();
		}
		
		Arrays.sort(N);
		
		if(N[0] + N[1] == N[2]) {
			System.out.println(1);			
		} else if(N[0] * N[1] == N[2]) {
			System.out.println(2);
		} else {
			System.out.println(3);
		}
		
	}
}
