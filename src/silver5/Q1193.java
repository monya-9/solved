package silver5;

import java.util.Scanner;

public class Q1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int cnt = 0;
		int n = 0;

		while (true) {
			n++;
			cnt += n;
			if (cnt >= X) {
				if (n % 2 == 0) {
					System.out.println(X - cnt + n + "/" + (cnt - X + 1));
				} else {
					System.out.println((cnt - X + 1) + "/" + (X - cnt + n));
				}
				break;
			}
		}
	}
}
