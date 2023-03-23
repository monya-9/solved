package bronze5;

import java.util.Scanner;

public class Q27866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int i = sc.nextInt();
		String[] str = S.split("");
		
		System.out.println(str[i-1]);
	}
}
