import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = N; i >0; i--) {
            int sum = 0;
            int reN = (N - i);
            while (reN > 0) {
                sum += reN % 10;
                reN /= 10;
            }
            if (sum + (N - i) == N) {
                answer = N - i;
                break;
            }

        }
        System.out.println(answer);
    }
}
