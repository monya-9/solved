package silver5;

import java.util.Scanner;

public class Q1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int cnt = 0;
		
		for (int i = 0; i < size; i++) {
			int num = sc.nextInt();
			
			for (int j = 2; j <= num; j++) {
				if (j == num) {
					cnt++;
				}
				if (num % j == 0) {
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}
