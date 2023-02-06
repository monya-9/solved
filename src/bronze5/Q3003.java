package bronze5;

import java.util.Scanner;

public class Q3003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] chess = { 1, 1, 2, 2, 2, 8 };
		int[] input = new int[chess.length];
		int[] output = { 0, 0, 0, 0, 0, 0 };

//		int[] output = new int[chess.length];
//		for (int i = 0; i < chess.length; i++) {
//			input[i] = sc.nextInt();
//			if(input[i] == chess[i]) {
//				output[i] = 0;
//			} else if(input[i] > chess[i]) {
//				output[i] = -1;
//			} else {
//				output[i] = 1;
//			}
//			System.out.print(output[i] + " ");
//		}

		for (int i = 0; i < chess.length; i++) {
			input[i] = sc.nextInt();
			while (input[i] != chess[i]) {
				if (input[i] > chess[i]) {
					output[i]--;
					input[i]--;
				} else {
					output[i]++;
					input[i]++;
				}
			}
			System.out.print(output[i] + " ");
		}
	}
}
