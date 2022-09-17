package silver5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Q23253 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		String yn = "Yes";

		Stack<Integer> stack = new Stack<>();

			for (int i = 0; i < M; i++) {
				int K = sc.nextInt();
				if (yn == "Yes") {
					for (int j = 0; j < K; j++) {
						int seq = sc.nextInt();
						stack.push(seq);
					}
					for (int j = 0; j < K - 1; j++) {
						int pk = stack.peek();
						stack.pop();
						if (pk < stack.peek()) {
							yn = "Yes";
						} else {
							yn = "No";
							break;
						}
					}
				} else {
					break;
				}
			}
		if (yn == "Yes") {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}


//입력
//첫째 줄에 교과서의 수 $N$, 교과서 더미의 수 $M$이 주어진다.
//
//둘째 줄부터 $2\times M$줄에 걸쳐 각 더미의 정보가 주어진다.
//
// $i$번째 더미를 나타내는 첫 번째 줄에는 더미에 쌓인 교과서의 수 $k_{i}$ 가 주어지며, 두 번째 줄에는 $k_{i}$ 개의 정수가 공백으로 구분되어 주어진다.
//
//각 정수는 교과서의 번호를 나타내며, 아래에 있는 교과서의 번호부터 주어진다.
//
//교과서의 번호는 $1$부터 $N$까지의 정수가 한 번씩만 등장한다.
//
//출력
//올바른 순서대로 교과서를 꺼낼 수 있다면 Yes를, 불가능하다면 No를 출력한다.
//
//제한
// $1 \leq M \leq N \leq 200\,000$ 
// $1 \leq k_i$ 
//모든 $k_{i}$의 합은 항상 $N$이다.