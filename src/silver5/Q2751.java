package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q2751 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(bf.readLine());
		int[] arr = new int[size];
		
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}

		Arrays.sort(arr);
		for (int j = 0; j < size; j++) {
			
			bw.write(arr[j] + "\n");
		}
		bw.close();
	}
}
