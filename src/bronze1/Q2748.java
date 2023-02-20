package bronze1;

import java.util.Scanner;

public class Q2748 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n-1];
		
		arr[0] = 0;
		if(n > 0) {
			arr[1] = 1;
		}
		for (int i = 2; i <= n; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
		}
		if(arr[n] < 0) {
			System.out.println(-arr[n]);			
		} else {
			System.out.println(arr[n]);
		}
	}
}
