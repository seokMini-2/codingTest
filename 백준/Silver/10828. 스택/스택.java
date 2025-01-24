import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (s.equals("pop")) {
                if (stk.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stk.pop()).append("\n");
                }
            } else if (s.equals("size")) {
                sb.append(stk.size()).append("\n");
            } else if (s.equals("empty")) {
                if (stk.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (s.equals("top")) {
                if (stk.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stk.peek()).append("\n");
                }
            } else {
                StringTokenizer st = new StringTokenizer(s);
                st.nextToken();
                stk.push(Integer.parseInt(st.nextToken()));
            }
        }
        System.out.println(sb);
    }
}
