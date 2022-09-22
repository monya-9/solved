package bronze3;

import java.util.Arrays;
import java.util.Scanner;

public class Q4153 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int[] num = new int[3];
			int a = 0;
			int b = 0;
			int c = 0;
			
			for (int i = 0; i < num.length; i++) {
				num[i] = sc.nextInt();
			}
			
			Arrays.sort(num);
			
			for (int i = 0; i < num.length; i++) {
				a = num[0];
				b = num[1];
				c = num[2];
			}
			
			if(a == 0 && b == 0 && c == 0) {
				break;
			}
			
			a *= a;
			b *= b;
			c *= c;
			
			if(a + b == c) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
	}
}
