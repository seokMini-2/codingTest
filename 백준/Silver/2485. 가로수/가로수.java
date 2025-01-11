import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Long[] arr = new Long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }
        long maxGcd = gcd(arr[1] - arr[0], arr[2] - arr[1]);
            for (int i = 2; i < N-1; i++) {
                maxGcd = gcd(maxGcd, arr[i + 1] - arr[i]);
            }
        long total = arr[N - 1] - arr[0];
        long answer = total / maxGcd - N + 1;
        System.out.println(answer);
    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
