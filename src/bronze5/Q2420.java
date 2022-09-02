package bronze5;

import java.util.Scanner;

public class Q2420 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		
		long num = N - M;
		System.out.println(Math.abs(num));
	}
}
