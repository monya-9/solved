package silver2;

import java.io.*;
import java.util.*;

public class Q1874 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> st = new Stack<>();
		
		int n = Integer.parseInt(br.readLine());
		int num = 1;
		boolean isPossible = true;
		
		for (int i = 0; i < n; i++) {
			int target = Integer.parseInt(br.readLine());
			
			while(num <= target) {
				st.push(num++);
				sb.append("+\n");
			}
			
			if(st.peek() == target) {
				st.pop();
				sb.append("-\n");
			} else {
				isPossible = false;
				break;
			}
		}
		
		System.out.println(isPossible ? sb : "NO");
	}
}