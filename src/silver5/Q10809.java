package silver5;

import java.util.Scanner;

public class Q10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		for(char ch = 'a'; ch<= 'z'; ch++) {
			System.out.print(S.indexOf(ch) + " ");
		}
	}
}
