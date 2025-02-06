import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 1 || n == 2 || n == 3) {
                sb.append(1).append("\n");
            } else if (n == 4||n==5) {
                sb.append(2).append("\n");
            }else{
                long[] dp = new long[n + 1];
                dp[1] = 1;
                dp[2] = 1;
                dp[3] = 1;
                dp[4] = 2;
                dp[5] = 2;
                for (int j = 6; j < n + 1; j++) {
                    dp[j] = dp[j - 1] + dp[j - 5];
                }
                sb.append(dp[n]).append("\n");
            }
        }
        System.out.println(sb);
    }
}
