package silver4;

import java.io.*;
import java.util.*;

public class Q28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Stack<String> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "1":
                    stack.push(st.nextToken());
                    break;
                case "2":
                    if(!stack.isEmpty()){
                        sb.append(stack.pop()).append("\n");
                    } else {
                        sb.append("-1").append("\n");
                    }
                    break;
                case "3":
                    sb.append(stack.size()).append("\n");
                    break;
                case "4":
                    if(!stack.isEmpty()){
                        sb.append("0").append("\n");
                    } else {
                        sb.append("1").append("\n");
                    }
                    break;
                case "5":
                    if(!stack.isEmpty()){
                        sb.append(stack.peek()).append("\n");
                    } else {
                        sb.append("-1").append("\n");
                    }

                    break;
            }
        }
        System.out.println(sb);
    }
}
