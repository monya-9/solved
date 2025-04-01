package bronze1;

import java.io.*;

public class Q2851 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = 0;
        int sum = 0;
        for (int i = 0; i < 10; i++){
            num = Integer.parseInt(br.readLine());

            if (sum + num > 100) {
                if (100 - sum < (sum + num) - 100) {
                    break;
                }
            }
            sum += num;
        }
        System.out.println(sum);
    }
}
