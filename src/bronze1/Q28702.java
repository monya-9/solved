package bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q28702 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 3; i > 0; i--) {
			String str = br.readLine();
			
			if(str.matches("^[0-9]*$")) {
				int n = Integer.parseInt(str) + i;
				
				if(n % 3 == 0) {
					if(n % 5 == 0) {
						System.out.println("FizzBuzz");
					} else {
						System.out.println("Fizz");
					}
				} else if (n % 5 == 0) {
					System.out.println("Buzz");
				} else {
					System.out.println(n);
				}
				return;
			}
		}
		br.close();
	}
}
