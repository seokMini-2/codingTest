import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            boolean s = true;

            for (int j=2;j<a;j++) {
                if (a % j == 0) {
                    s = false;
                    break;
                }
            }

            if (a != 1 && s) {
                cnt++;
            }

        }
        System.out.println(cnt);
    }
}
