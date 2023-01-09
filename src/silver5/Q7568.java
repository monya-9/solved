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

		int[][] xy = new int[num][2];

		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine());
			xy[i][0] = Integer.parseInt(st.nextToken());
			xy[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(xy, (arr1, arr2) -> {
			if (arr1[1] == arr2[1]) {
				return arr1[0] - arr2[0];
			} else {
				return arr1[1] - arr2[1];
			}
		});

		int cnt = 0;
		for (int i = 0; i < xy.length; i++) {
			cnt++;
			System.out.print(cnt);
		}
	}
}