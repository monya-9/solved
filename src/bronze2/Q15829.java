package bronze2;

import java.util.Scanner;

public class Q15829 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		String input = sc.next();
		int M = 1234567891;
		long r = 1;
		long result = 0;
		
		 for (int i = 0; i < L; i++) {
			result += ((input.charAt(i)-96) * r) % M;
			
			r = (r * 31) % M;
		}
		
		System.out.println(result % M);
		
	}
}