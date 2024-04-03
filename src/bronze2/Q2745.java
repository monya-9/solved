package bronze2;

import java.util.Scanner;

public class Q2745 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int num = sc.nextInt();
		int result = 0;
		
		char ch = ' ';
		int diVal = 0;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			diVal = Character.isDigit(ch) ? (ch - '0') : (ch - 'A' + 10);
			
			result = result * num + diVal;
		}
		
		System.out.println(result);
    }
}
