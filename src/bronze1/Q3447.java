package bronze1;

import java.util.Scanner;

public class Q3447 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String input = sc.nextLine();
			String str = input.replace("BUG", "");

			while(true) {
				if (input.equals(str)) {
					System.out.println(str);
					break;
				}
				input = str;
				str = str.replace("BUG", "");
			}
		}
	}
}
