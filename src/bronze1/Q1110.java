package bronze1;

import java.util.Scanner;

public class Q1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = N;
		int cnt = 0;
		
		do {
			int f = num / 10;
			int l = num % 10;
			int sum = (f+l)%10;
			num = (l*10)+sum;
			
			cnt++;
		} while(N != num);
		
		System.out.println(cnt);
	}
}
