package silver5;

import java.util.Scanner;

public class Q2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] com = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		String[] til = str.split("");
		int cnt = 0;
		int n = 0;

		for (int i = 0; i < til.length; i++) {
			for (int j = 0; j < com.length; j++) {
				if (i < til.length - 2) {
					if (com[j].equals(til[i] + til[i + 1]) || "dz=".equals(til[i] + til[i + 1]+til[i+2])) {
						n++;
					}
				} else if(i < til.length - 1 && com[j].equals(til[i] + til[i + 1])) {
					n++;
				}
			}
			if (n > 0) {
				cnt++;
				i++;
				n = 0;
			} else if (!"=".equals(til[i]) || !"=".equals(til[i])) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
