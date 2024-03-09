package silver1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q1931 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] m = new int[n][2];
        int count = 0;
        int prevEnd = 0;

        for (int i = 0; i < n; i++) {
            m[i][0] = scanner.nextInt();
            m[i][1] = scanner.nextInt();
        }

        Arrays.sort(m, Comparator.comparingInt(a -> a[0]));
        Arrays.sort(m, Comparator.comparingInt(a -> a[1]));

        for (int[] meeting : m) {
            if (meeting[0] >= prevEnd) {
                count++;
                prevEnd = meeting[1];
            }
        }
        System.out.println(count);
    }
}

