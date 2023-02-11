package bronze3;

import java.util.Arrays;
import java.util.Scanner;

public class Q5576 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] W = new int[10];
		int[] K = new int[10];
		int Wmax = 0;
		int Kmax = 0;
		
		for (int i = 0; i < W.length; i++) {
			W[i] = sc.nextInt();
		}
		for (int i = 0; i < K.length; i++) {
			K[i] = sc.nextInt();
		}
		
		Arrays.sort(W);
		Arrays.sort(K);
		
		for (int i = W.length-1; i >= 7; i--) {
			Wmax += W[i];
		}
		
		for (int i = K.length-1; i >= 7; i--) {
			Kmax += K[i];
		}
		
		System.out.println(Wmax + " " + Kmax);
	}
}
