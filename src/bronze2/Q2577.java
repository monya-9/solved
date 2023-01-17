package bronze2;

import java.util.Scanner;

public class Q2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int mul = A*B*C;
		
		String[] strMul = Integer.toString(mul).split("");
		
		for (int i = 0; i < strMul.length; i++) {
			
			System.out.println(strMul[i]);
		}
	}
}
