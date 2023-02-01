package silver5;

import java.util.Scanner;

public class Q2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();

		int num = M;
		int[] mn = new int[(N - M)+1];
		int sum = 0;
		int min = 0;
		for (int i = 0; i < mn.length; i++) {
			if (num >= M && num <= N) {
				for (int j = 2; j <= num + 2; j++) {
					if (j == num) {
						mn[i] = num;
					} else if (num % j == 0) {
						break;
					}
				}
				if (mn[i] != 0) {
					sum += mn[i];
					if (min == 0) {
						min = mn[i];
					}
				}
			}
			num++;
		}
		if(sum == 0) {
			sum = -1;
			System.out.println(sum);
		} else {
			System.out.println(sum);
			System.out.println(min);			
		}
	}
}
