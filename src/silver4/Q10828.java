package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q10828 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(bf.readLine());

		Stack<String> stack = new Stack<>();

		for (int i = 0; i < size; i++) {
			String str = bf.readLine();
			String arr[] = str.split(" ");

			for (int j = 0; j < 1; j++) {
				if (str.equals("top")) {
					if (stack.empty()) {
						System.out.println("-1");
					} else {
						System.out.println(stack.peek());
					}
				} else if (str.equals("pop")) {
					if (stack.empty()) {
						System.out.println("-1");
					} else {
						System.out.println(stack.pop());
					}
				} else if (str.equals("size")) {
						System.out.println(stack.size());
				} else if (str.equals("empty")) {
					if (stack.empty()) {
						System.out.println("1");
					} else {
						System.out.println("0");
					}
				} else if(arr[0].equals("push")) {
					stack.push(arr[1]);					
				}
			}
		}
	}
}
