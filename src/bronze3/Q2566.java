package bronze3;

import java.util.Scanner;

public class Q2566 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] num = new int[10][10];
		int max = -1;
		int row = 0;
		int column = 0;

		for (int i = 1; i < num.length; i++) {
			for (int j = 1; j < num.length; j++) {
				num[i][j] = sc.nextInt();

				if (num[i][j] > max) {
					max = num[i][j];
					row = i;
					column = j;
				}
			}
		}
		System.out.println(max);
		System.out.println(row + " " + column);
	}
}
