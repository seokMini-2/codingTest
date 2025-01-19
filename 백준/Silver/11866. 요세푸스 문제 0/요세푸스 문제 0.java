import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queueFinal = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }
        int cnt = 1;

        while (!queue.isEmpty()) {
            if (cnt < K) {
                queue.offer(queue.poll());
                cnt++;
            } else {
                queueFinal.offer(queue.poll());
                cnt = 1;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<").append(queueFinal.poll());
        for (Integer i : queueFinal) {
            sb.append(", ").append(i);
        }
        sb.append(">");
        System.out.println(sb);
    }
}
