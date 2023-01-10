package bronze2;

import java.util.Scanner;

public class Q2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int reA = 0;
		int reB = 0;
		
		while(A != 0) {
			reA = reA*10 + A % 10;
			A /= 10;
		}

		while(B != 0) {
			reB = reB*10 + B % 10;
			B /= 10;
		}
		
		System.out.println(reA > reB? reA : reB); 
	}
}
