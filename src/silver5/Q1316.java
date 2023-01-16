package silver5;

import java.util.Scanner;

public class Q1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = N;

		for (int c = 0; c < N; c++) {
			String st = sc.next();
			boolean check[] = new boolean[26];

			for (int i = 0; i < st.length() - 1; i++) {
				if (st.charAt(i) != st.charAt(i + 1)) {
					if (check[st.charAt(i + 1) - 97] == true) {
						cnt--;
						break;
					}
				}
				check[st.charAt(i) - 97] = true;
			}
		}
		System.out.println(cnt);
	}
}