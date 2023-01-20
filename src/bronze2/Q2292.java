package bronze2;

import java.util.Scanner;

public class Q2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int layer = 1;
		int min = 2;

		if (num == 1) {
			System.out.println(1);
		} else {
			while (min <= num) {
				min += (6*layer);
				layer++;
			}
		}
		System.out.println(layer);
	}
}
