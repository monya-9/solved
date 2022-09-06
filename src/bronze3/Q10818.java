package bronze3;

import java.util.Arrays;
import java.util.Scanner;

public class Q10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] num = new int[size];
		
		int max = 0;
		int min = 0;
		
		for (int i = 0; i < size; i++) {
			num[i] = sc.nextInt();
			
			if(num[i] > max) {
				max = num[i];
			}
		}
	}
}
