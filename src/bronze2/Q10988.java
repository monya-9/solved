package bronze2;

import java.util.Scanner;

public class Q10988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder sb = new StringBuilder(str);
		
		if(str.equals(sb.reverse().toString())) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
