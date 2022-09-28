package bronze1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q10989 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(bf.readLine());
		int[] num = new int[size];
		
		for (int i = 0; i < size; i++) {
			num[i] = Integer.parseInt(bf.readLine());
		}
		
		Arrays.sort(num);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < num.length; i++) {
			bw.write(String.valueOf(num[i]));
			bw.write("\n");
		}
		bw.close();
	}
}
