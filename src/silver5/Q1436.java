package silver5;

import java.util.Scanner;

public class Q1436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt = 0;
		String str = "";
		
		int i = 0;
		while(true) {
			i++;
			str = Integer.toString(i);
			if (str.contains("666")) {
				cnt++;
			}
			if (cnt == N) {
				break;
			}
		}
		System.out.println(i);
	}
}