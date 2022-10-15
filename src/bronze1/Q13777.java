package bronze1;

import java.util.Scanner;

public class Q13777 {	//이진탐색
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int num = sc.nextInt();
			if (num == 0)
				break;

			int[] arr = new int[50];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = i + 1;
			}
			int output = search(arr, num);
			System.out.println(output);
		}
	}

	private static int search(int[] arr, int num) {
		int mid = 25;
		int low = 1;
		int hight = 50;

		while (low <= hight) {
			mid = (low + hight) / 2;
			if (mid != num) {
				System.out.print(mid + " ");
			}
			if (mid == num)
				break;
			if (mid < num)
				low = mid + 1;
			else
				hight = mid - 1;
		}
		return mid;
	}
}
