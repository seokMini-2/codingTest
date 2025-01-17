import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String S = br.readLine();
            if (S.equals(".")) {
                break;
            }

            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == '(' || S.charAt(i) == '[') {
                    stack.push(S.charAt(i));
                } else if (S.charAt(i) == ')') {
                    if (stack.isEmpty()) {
                        stack.push(')');
                        break;
                    }
                    if (stack.peek() == '(') {
                            stack.pop();
                    } else stack.push(')');
                }else if (S.charAt(i) == ']') {
                    if (stack.isEmpty()) {
                        stack.push(']');
                        break;
                    }
                    if (stack.peek() == '[') {
                            stack.pop();
                    } else stack.push(']');
                }
            }

            if (stack.isEmpty()) {
                sb.append("yes").append("\n");
            } else sb.append("no").append("\n");
        }
        System.out.println(sb);
    }
}
