package bronze4;

import java.util.Scanner;

public class Q11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int n = 0;
		
		String[] arr = new String[N]; 
		arr = sc.next().split("");
		for (int i = 0; i < N; i++) {
			
			int num = Integer.parseInt(arr[i]);
			n += num;
		}
		System.out.println(n);
	}
}
