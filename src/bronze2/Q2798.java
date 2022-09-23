package bronze2;

import java.util.Scanner;

public class Q2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] num = new int[N];
		int sum = 0;
		int max = 0;
		
		for (int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}
		
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				for (int k = j+1; k < num.length; k++) {
						sum = num[i]+num[j]+num[k];
						if(sum > max && sum <= M) {
							max = sum;
					}
				}
			}
		}
		System.out.println(max);
	}
}
