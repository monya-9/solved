package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q4158 { // 이진탐색
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			if (N == 0 && M == 0)
				break;

			int[] Narr = new int[N];
			int[] Marr = new int[M];

			for (int i = 0; i < N; i++) {
				Narr[i] = Integer.parseInt(br.readLine());
			}

			Arrays.sort(Narr);

			for (int i = 0; i < M; i++) {
				Marr[i] = Integer.parseInt(br.readLine());
			}

			int output = 0;
			for (int i = 0; i < Marr.length; i++) {
				output += search(Narr, Marr, i);
			}
			System.out.println(output + " ");
		}
	}

	private static int search(int[] narr, int[] marr, int i) {
		int low = 0;
		int hight = narr.length - 1;
		int mid;
		int cnt = 0;

		while (low <= hight) {
			mid = (low + hight) / 2;
			if (narr[mid] == marr[i])
				return 1;
			else if (narr[mid] > marr[i])
				hight = mid - 1;
			else
				low = mid + 1;
		}
		return 0;
	}
}