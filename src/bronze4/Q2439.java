package bronze4;

import java.util.Scanner;

public class Q2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = num; i > 0; i--) {
			for (int j = 0; j < i - 1; j++)
				System.out.print(" ");
			for (int k = num; k > i - 1; k--)
				System.out.print("*");
			System.out.println();
		}
	}
}