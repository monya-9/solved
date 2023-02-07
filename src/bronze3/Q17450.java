package bronze3;

import java.util.Scanner;

public class Q17450 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c = "";

		for (int i = 0; i < 3; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int max = 0;

			if (a * 10 >= 5000) {
				a = a * 10 - 500;
			} else {
				a *= 10;
			}

			b *= 10;
			
			if (max < b / a) {
				max = a / b;
				if (i == 0) {
					c = "S";
				} else if (i == 1) {
					c = "N";
				} else if (i == 2) {
					c = "U";
				}
			}
		}
		System.out.println(c);
	}
}
