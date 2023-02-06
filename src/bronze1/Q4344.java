package bronze1;

import java.util.Scanner;

public class Q4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		int N = 0;
		int[] score = {};
		int total = 0;
		double avg = 0;
		double per = 0;
		double cnt = 0;
		
		for (int i = 0; i < C; i++) {
			N = sc.nextInt();
			score = new int[N];
			for (int j = 0; j < N; j++) {
				score[j] = sc.nextInt();
				total += score[j];
			}
			avg = total / N;
			for (int k = 0; k < N; k++) {
				if(avg < score[k]) {
					cnt++;
				}				
			}
			per = cnt / N * 100;

			System.out.println(String.format("%.3f", per) + "%");
			total = 0;
			cnt = 0;
		}
	}
}
