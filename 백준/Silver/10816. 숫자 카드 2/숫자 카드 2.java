import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> card = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            card.put(num, card.getOrDefault(num, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int qNum = Integer.parseInt(st2.nextToken());
            sb.append(card.getOrDefault(qNum, 0)).append(" ");
        }
        System.out.println(sb);
    }
}
