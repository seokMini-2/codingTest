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
                        System.out.println(-1);
                    } else {
                        System.out.println(stk.pop());
                    }
                    break;
                case 3:
                    System.out.println(stk.size());
                    break;
                case 4:
                    System.out.println(stk.isEmpty() ? 1 : 0);
                    break;
                case 5:
                    if (stk.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stk.peek());
                    }
                    break;
                default:
                    System.out.println("잘못된 메뉴");
                    break;
            }
        }
    }
}
