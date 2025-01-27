import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> que = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int a=-1;
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (s.equals("pop")) {
                if (que.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(que.poll()).append("\n");
                }
            } else if (s.equals("size")) {
                sb.append(que.size()).append("\n");
            } else if (s.equals("empty")) {
                if (que.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (s.equals("front")) {
                if (que.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(que.peek()).append("\n");
                }
            } else if (s.equals("back")) {
                if (que.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(a).append("\n");
                }
            } else {
                StringTokenizer st = new StringTokenizer(s);
                st.nextToken();
                a = Integer.parseInt(st.nextToken());
                que.offer(a);
            }
        }
        System.out.println(sb);
    }
}
