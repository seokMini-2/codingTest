import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            sb.append(N-1).append("\n");
            if (i == T - 1) {
                break;
            }
            int M = Integer.parseInt(st.nextToken());
            for (int j = 0; j < M; j++) {
                br.readLine();
            }
        }
        System.out.println(sb);
    }
}
