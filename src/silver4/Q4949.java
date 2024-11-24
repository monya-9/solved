package silver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Q4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		while(true) {
			str = br.readLine();
			
			if(str.equals(".")) break;
			
			if (isBalanced(str)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		br.close();
	}

	private static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<>();
		
		for (char ch : str.toCharArray()) {
			if(ch == '(' || ch == '[') {
				stack.push(ch);
			} else if (ch == ')' || ch == ']') {
				if(stack.isEmpty()) {
					return false;
				}
				
				char top = stack.pop();
				if ((ch == ')' && top != '(') || (ch == ']' && top != '[')) {
                    return false;
                }
			}
		}
		return stack.isEmpty();
	}
}
