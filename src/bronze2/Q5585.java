package bronze2;

import java.util.Scanner;

public class Q5585 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n = 1000 - n;
		
		int n500 = n/500;
		n = n%500;
		int n100 = n/100;
		n = n%100;
		int n50 = n/50;
		n = n%50;
		int n10 = n/10;
		n = n%10;
		int n5 = n/5;
		n = n%5;
		int n1 = n/1;
		n = n%1;
		
		System.out.println(n500+n100+n50+n10+n5+n1);
	}
}