package silver5;

import java.math.BigInteger;
import java.util.Scanner;

public class Q2338 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		
		BigInteger sum = A.add(B);
		BigInteger sub = A.subtract(B);
		BigInteger mul = A.multiply(B);
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
	}
}
