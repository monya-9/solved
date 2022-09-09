package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Q10845 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(bf.readLine());

		Queue<String> queue = new LinkedList<>();
		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < size; i++) {
			String str = bf.readLine();
			String arr[] = str.split(" ");

			for (int j = 0; j < 1; j++) {
				if (str.equals("pop")) {
					if (queue.isEmpty()) {
						System.out.println("-1");
					} else {
						System.out.println(queue.poll());
					}
				} else if (str.equals("size")) {
					System.out.println(queue.size());
				} else if (str.equals("empty")) {
					if (queue.isEmpty()) {
						System.out.println("1");
					} else {
						System.out.println("0");
					}
				} else if (str.equals("front")) {
					if (queue.isEmpty()) {
						System.out.println("-1");
					} else {
						System.out.println(queue.peek());
					}
				} else if (str.equals("back")) {
					if (queue.isEmpty()) {
						System.out.println("-1");
					} else {
						System.out.println(list.get(list.size() - 1));
					}
				} else {
					queue.offer(arr[1]);
					list.add(arr[1]);
				}
			}
		}
	}
}
