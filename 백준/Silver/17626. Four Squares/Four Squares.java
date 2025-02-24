import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[50001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for (int i = 4; i <= n; i++) {
            int sqrt = (int) Math.sqrt(i);
            dp[i] = dp[i - (int) Math.pow(sqrt, 2)];
            for (int j = 1; j < sqrt; j++) {
                dp[i] = Math.min(dp[i - j * j], dp[i]);
            }
            dp[i]++;
        }
        System.out.println(dp[n]);
    }
}
