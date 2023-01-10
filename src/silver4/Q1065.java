package silver4;

import java.util.Scanner;

public class Q1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		System.out.println(series(N));
	}

	public static int series(int n) {
		int cnt = 0;
		int iN = 0;
		for (int i = 1; i <= n; i++) {
			if (i <= 99) { // 1~99까지는 모두 한수이므로 1씩 증가
				cnt++;
			} else if (i <= 999) {
				iN = i;
				int hund = iN / 100; //100의 자리
				int ten = (iN / 10) % 10; //10의 자리
				int one = i % 10; //1의 자리
				
				if((hund - ten) == (ten - one)) { // 두 자리 값을 뺀 값이 서로 같을때
					cnt++;
				}
			}
		}

		return cnt;

	}
}
