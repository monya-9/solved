package silver4;

import java.util.Scanner;
import java.util.Stack;

public class Q10773 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int b = 0;

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < size; i++) {
			int num = sc.nextInt();
			if (num == 0) {
				stack.pop();
			} else {
				stack.push(num);
			}
		}
		for (int a : stack) {
			b+= a;
		}
		System.out.println(b);
	}
}
