package bronze5;

import java.util.Scanner;

public class Q10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = 1;

		for (int i = 1; i <= N; i++) {
			num *= i;
		}
		System.out.println(num);
	}
}
