package bronze3;

import java.util.Scanner;

public class Q10162 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int A = T/300;
		T = T%300;
		int B = T/60;
		T = T%60;
		int C = T/10;
		T = T%10;
		
		if(T == 0) {
			System.out.println(A + " " + B + " " + C);
		} else {
			System.out.println(-1);
		}
	}
}