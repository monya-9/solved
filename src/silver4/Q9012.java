package silver4;

import java.util.Scanner;
import java.util.Stack;

public class Q9012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		Stack<Character> stack = new Stack<>();
		String str = sc.nextLine();

		for (int i = 0; i < T; i++) {
			str = sc.nextLine();
			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				if (stack.isEmpty())
					stack.push(c);
				else {
					if (c == ')') {
						if (stack.peek() == '(') {
							stack.pop();
						} else {
							stack.push(c);
						}
					} else {
						stack.push(c);
					}
				}
			}
			if (stack.isEmpty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			stack.clear();
		}
	}
}
