package bronze1;

import java.util.Scanner;

public class Q10798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] A = new String[5];
		
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.next();
		}
		
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < A.length; j++) {
				if (i < A[j].length()) {
					System.out.print(A[j].charAt(i));
				}
			}
		}
	}
}
