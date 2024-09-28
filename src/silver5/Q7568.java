package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q7568 { // 브루트포스 알고리즘
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		StringTokenizer st = null;

		int xy[][] = new int[num][2];
		int arr[] = new int[num];

		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine());
			xy[i][0] = Integer.parseInt(st.nextToken());
			xy[i][1] = Integer.parseInt(st.nextToken());
		}		
		
		for (int i = 0; i < num; i++) {
			arr[i] = 1;
			for (int j = 0; j < num; j++) {
				if(xy[i][0] < xy[j][0] && xy[i][1] < xy[j][1]) {
					arr[i]++;
				}
				
			}
			System.out.print(arr[i] + " ");
		}
	}
}