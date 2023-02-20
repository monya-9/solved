package bronze2;

import java.util.Scanner;

public class Q2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int[] num = new int[10];

		int mul = A * B * C;

		while (mul > 0) {
			num[mul % 10]++;
			mul /= 10;
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(num[i]);
		}
	}
}
