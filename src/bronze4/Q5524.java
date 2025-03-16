package bronze4;

import java.io.*;

public class Q5524 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			String str = br.readLine().toLowerCase();
			
			sb.append(str).append("\n");
			
		}
		
		System.out.println(sb.toString());
	}
}
