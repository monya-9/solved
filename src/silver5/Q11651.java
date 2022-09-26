package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11651 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());

		StringTokenizer st = null;

		int[][] XY = new int[size][2];

		for (int i = 0; i < size; i++) {
			st = new StringTokenizer(br.readLine());
			XY[i][0] = Integer.parseInt(st.nextToken());
			XY[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(XY, (arr1, arr2) -> {
			if(arr1[1] == arr2[1]) {
				return arr1[0] - arr2[0];
			} else {
				return arr1[1] - arr2[1];
			}
		});
		
		for (int i = 0; i < size; i++) {
			System.out.println(XY[i][0] + " " + XY[i][1]);
		}
	}
}
