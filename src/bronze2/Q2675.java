package bronze2;

import java.util.Scanner;

public class Q2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int R = sc.nextInt();
			String str = sc.next();

			String S[] = str.split("");

			for (int j = 0; j < str.length(); j++) {
				for (int k = 0; k < R; k++) {
					System.out.print(S[j]);
				}
			}
			System.out.println();
		}
		
//		Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//
//        for(int i=0; i<n; i++){
//            int m = sc.nextInt();
//            String s= sc.next();
//            String str[] =s.split("");
//            for (String arr : str){
//                for(int j=0; j<m; j++) System.out.print(arr);
//            }
//            System.out.println();
//
//        }
	}
}
