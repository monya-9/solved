package silver2;

import java.io.*;
import java.util.*;

public class Q1406 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		Stack<Character> leftStack = new Stack<>();
		Stack<Character> rightStack = new Stack<>();
		
		for(char ch : str.toCharArray()) {
			leftStack.push(ch);
		}
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			String cmd = br.readLine();
			
			if(cmd.startsWith("P")) {
				leftStack.push(cmd.charAt(2));
			} else if(cmd.equals("L") && !leftStack.isEmpty()) {
				rightStack.push(leftStack.pop());
			} else if(cmd.equals("D") && !rightStack.isEmpty()) {
				leftStack.push(rightStack.pop());
			} else if(cmd.equals("B") && !leftStack.isEmpty()) {
				leftStack.pop();
			}
		}
		
		while(!leftStack.isEmpty()) {
			sb.append(leftStack.pop());
		}
		
		while(!rightStack.isEmpty()) {
			sb.append(rightStack.pop());
		}
		
		System.out.println(sb.toString());
	}
}
