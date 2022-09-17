package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q3986 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int cnt=0;
		
		for(int i=0; i<n; i++) {
			String str = bf.readLine();
			Stack<Character> stack = new Stack<>();
			
			for(int j=0; j<str.length(); j++) {
				if(stack.size()>0 && stack.peek() == str.charAt(j)) {
					stack.pop();
				}else {
					stack.push(str.charAt(j));
				}
			}
			if(stack.size()==0) cnt++;
		}
		System.out.println(cnt);
	}
}
