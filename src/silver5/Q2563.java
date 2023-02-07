package silver5;

import java.util.Scanner;

public class Q2563 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int X = 0;
		int Y = 0;
		int[][] XY = new int[100][100];
		int cnt = 0;

		for (int i = 0; i < T; i++) {
			X = sc.nextInt();
			Y = sc.nextInt();

			for (int j = X; j < X + 10; j++) {
				for (int k = Y; k < Y + 10; k++) {
					XY[j][k] = 1;
				}
			}
		}

		for (int i = 0; i < XY.length; i++) {
			for (int j = 0; j < XY.length; j++) {
				if (XY[i][j] == 1) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
