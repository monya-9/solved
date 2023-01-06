package bronze5;

import java.util.Scanner;

public class Q5597 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] N = new int[31];
		int num = 0;

		for (int i = 1; i < N.length-2; i++) {
			num = sc.nextInt();
			N[num] = num;
		}
		
		for (int i = 1; i < N.length; i++) {
			if (N[i] == 0) {
				System.out.println(i);
			}
		}
	}
}
