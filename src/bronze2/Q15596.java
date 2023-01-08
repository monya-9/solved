package bronze2;

import java.util.Scanner;

class Test {
    long sum(int[] a) {
        long ans = 0;
        for (int i = 0; i < a.length; i++) {
			 ans += a[i];
		}
        return ans;
    }
}

public class Q15596 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nn = new int[n];
		
		for (int i = 0; i < n; i++) {
			nn[i] = sc.nextInt();
		}
		
		Test Test = new Test();
		long s = Test.sum(nn);
		System.out.println(s);
	}
}
