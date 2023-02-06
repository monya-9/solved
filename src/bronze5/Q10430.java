package bronze5;

import java.util.Scanner;

public class Q10430 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int n1 = (A+B)%C;
		int n2 = ((A%C)+(B%C))%C;
		int n3 = (A*B)%C;
		int n4 = ((A%C) * (B%C))%C;
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
	}
}