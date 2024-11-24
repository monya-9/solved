package bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11050 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int k = Integer.parseInt(input[1]);
		
		long result = 1;
		
		if(k > n - k) {
			k = n - k;
		}
		
		for (int i = 0; i < k; i++) {
			result *= (n - i);
			result /= (i + 1);
		}
		
		System.out.println(result);
	}
}
