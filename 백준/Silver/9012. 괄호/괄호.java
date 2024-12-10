import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            Stack<Character> stk = new Stack<>();
            String str = br.readLine();
            boolean problem = false;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '(') {
                    stk.push(str.charAt(j));
                } else {
                    if (stk.isEmpty()) {
                        problem = true;
                        break;
                    } else {
                        stk.pop();
                    }
                }
            }
            if (stk.isEmpty() && !problem) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }
        System.out.println(sb);
    }
}