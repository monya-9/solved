package bronze3;

import java.util.Scanner;

public class Q30802 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] sizes = new int[6];
        for (int i = 0; i < sizes.length; i++) {
            sizes[i] = sc.nextInt();
        }
        
		int T1 = sc.nextInt();
		int P1 = sc.nextInt();
		
		int T2 = 0;
		int P2, P3 = 0;
		for (int i = 0; i < sizes.length; i++) {
			T2 += sizes[i] / T1;
			T2 = sizes[i] % T1 > 0 ? T2+1 : T2;
		}
		
		P2 = N / P1;
		P3 = N % P1;	
		
		System.out.println(T2);
		System.out.println(P2 + " " + P3);
	}
}
