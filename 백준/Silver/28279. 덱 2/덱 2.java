import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String menu = br.readLine();
            if (menu.equals("3")) {
                if (deque.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque.poll()).append("\n");
                }
            } else if (menu.equals("4")) {
                if (deque.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque.pollLast()).append("\n");
                }
            } else if (menu.equals("5")) {
                sb.append(deque.size()).append("\n");
            } else if (menu.equals("6")) {
                if (deque.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (menu.equals("7")) {
                if (deque.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque.peek()).append("\n");
                }
            } else if (menu.equals("8")) {
                if (deque.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque.peekLast()).append("\n");
                }
            } else {
                StringTokenizer st = new StringTokenizer(menu);
                int option = Integer.parseInt(st.nextToken());
                int X = Integer.parseInt(st.nextToken());
                if (option == 1) {
                    deque.offerFirst(X);
                } else {
                    deque.offer(X);
                }
            }
        }
        System.out.println(sb);
    }
}
