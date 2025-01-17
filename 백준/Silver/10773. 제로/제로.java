import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> num = new Stack<>();
        for (int i = 0; i < K; i++) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) {
                num.pop();
            } else num.push(N);
        }
        int answer = 0;
        for (Integer i : num) {
            answer += i;
        }
        System.out.println(answer);
    }
}
