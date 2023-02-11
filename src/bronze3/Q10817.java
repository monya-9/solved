package bronze3;

import java.util.Arrays;
import java.util.Scanner;

public class Q10817 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] N = new int[3];
		
		for (int i = 0; i < N.length; i++) {
			N[i] = sc.nextInt();
		}
		
		Arrays.sort(N);
		System.out.println(N[1]);
	}
}
