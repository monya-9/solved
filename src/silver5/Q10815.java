package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10815 {	//이중 탐색
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] Nnum = new int[N];

		int low = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			Nnum[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(Nnum);

		int M = Integer.parseInt(br.readLine());
		int[] Mnum = new int[M];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			Mnum[i] = Integer.parseInt(st.nextToken());

			System.out.print(binarySearch(Nnum, Mnum, i) + " ");
		}
	}

	static int binarySearch(int[] Nnum, int[] Mnum, int i) {
		int bottom = 0, top = Nnum.length - 1, middle;

		while (bottom <= top) {
			middle = (bottom + top) / 2;
			if (Nnum[middle] == Mnum[i]) {
				return 1;
			} else if (Nnum[middle] > Mnum[i]) {
				top = middle - 1;
			} else if (Nnum[middle] < Mnum[i]) {
				bottom = middle + 1;
			}
		}
		return 0;
	}
}