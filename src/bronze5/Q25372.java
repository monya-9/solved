package bronze5;

import java.util.Scanner;

public class Q25372 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		for (int i = 0; i < size; i++) {
			String[] psw = sc.next().split("");
			
			if(psw.length >= 6 && psw.length <= 9) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}
