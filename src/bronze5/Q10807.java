package bronze5;

import java.util.Scanner;

public class Q10807 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N];
		for (int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
			
		}
		int V = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			if(V == num[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
