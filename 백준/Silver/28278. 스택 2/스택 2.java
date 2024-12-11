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
            StringTokenizer st = new StringTokenizer(br.readLine());
            int menu = Integer.parseInt(st.nextToken());

            switch (menu) {
                case 1:
                    int num = Integer.parseInt(st.nextToken());
                    stk.push(num);
                    break;
                case 2:
                    if (stk.isEmpty()) {
                        sb.append(-1+"\n");
                    } else {
                        sb.append(stk.pop()+"\n");
                    }
                    break;
                case 3:
                    sb.append(stk.size()+"\n");
                    break;
                case 4:
                    sb.append(stk.isEmpty() ? 1 : 0).append("\n");
                    break;
                case 5:
                    if (stk.isEmpty()) {
                        sb.append(-1+"\n");
                    } else {
                        sb.append(stk.peek()+"\n");
                    }
                    break;
                default:
                    sb.append("잘못된 메뉴"+"\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
