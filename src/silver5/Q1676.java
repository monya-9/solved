package silver5;

import java.util.Scanner;

public class Q1676 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt = 0;
		
		cnt = N/5;
		cnt += N/25;
		cnt += N/125;
		
		System.out.println(cnt);
	}
}