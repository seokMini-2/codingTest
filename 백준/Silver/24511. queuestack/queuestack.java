import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer stQorS = new StringTokenizer(br.readLine());
        Deque<Integer> QorS = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            QorS.offer(Integer.parseInt(stQorS.nextToken()));
        }

        StringTokenizer stInput = new StringTokenizer(br.readLine());
        Deque<Integer> InputVal = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            int a = Integer.valueOf(stInput.nextToken());
            if (QorS.pop() == 0) {
                InputVal.offer(a);
            }
        }

        int M = Integer.parseInt(br.readLine());

        StringTokenizer CValue = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            InputVal.offerFirst(Integer.valueOf(CValue.nextToken()));
            sb.append(InputVal.pollLast()).append(" ");
        }
        System.out.println(sb);
    }
}
