package bronze3;

import java.util.Arrays;
import java.util.Scanner;

public class Q10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] num = new int[size];

		for (int i = 0; i < size; i++) {
			num[i] = sc.nextInt();
			
		}
		Arrays.sort(num);
		
		for (int i = 0; i < 1; i++) {
			System.out.println(num[0] + " " + num[size-1]);			
		}
	}
}
