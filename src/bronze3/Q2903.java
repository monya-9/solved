package bronze3;

import java.util.Scanner;

public class Q2903 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int points = 1;
		
	    for (int i = 0; i < n; i++) {
	    	points *= 2;
	    }
        int result = (points + 1) * (points + 1);
        System.out.println(result);
	}
}
