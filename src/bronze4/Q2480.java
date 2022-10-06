package bronze4;

import java.util.Scanner;

public class Q2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max = 0;
		if(a != b && a != c && b != c) {
			if(a > b && a > c) {
				a *= 100;
				max = a;
			}
			else if(b > a && b > c) {
				b *= 100;
				max = b;
			}
			else if(c > a && c > b) {
				c *= 100;
				max = c;
			}
			
			System.out.println(max);
		}else {
			if(a == b & a == c) {
				a *= 1000;
				a += 10000;
				System.out.println(a);
			} else {
				if(a == b) {
					a *= 100;
					a += 1000;
					System.out.println(a);
				} else if(a == c) {
					a *= 100;
					a += 1000;
					System.out.println(a);
				} else if(b == c) {
					b *= 100;
					b += 1000;
					System.out.println(b);
				}		
			}
		}
	}
}
