package bronze3;

import java.util.Scanner;

public class Q0810 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] BS = new int[N+1];
		
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			int j = a;
			 while(j >= a && j <= b) {
				BS[j] = c;
				j++;
			}
		}
		
		for (int i = 1; i < BS.length; i++) {
			System.out.print(BS[i] + " ");
		}
	}
}
