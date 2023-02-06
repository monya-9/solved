package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2869 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		int day = 0;
		int asum = A;
		for (int i = 0; i < V; i++) {
			if(day != V) {
				day += 1;
				asum += A;
				asum -= B;
			} else if(asum >= V) {
				bw.write(String.valueOf(day));
				break;
			}
			
		}
		
		
//		if(A+B < V) {
//			System.out.println(V - B);
//		}else {
//			System.out.println(2);
//		}
	}
}
