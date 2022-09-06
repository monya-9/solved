package bronze2;

import java.util.Scanner;

public class Q2920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[8];
		
		String msg = "";
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		for (int i = 0; i < num.length - 1; i++) {
			if (num[i] == num[i + 1] - 1) {
				msg = "ascending";
			} else if (num[i] == num[i + 1] + 1) {
				msg = "descending";
			} else {
				msg = "mixed";
				break;
			}
		}
		System.out.println(msg);
	}
}
