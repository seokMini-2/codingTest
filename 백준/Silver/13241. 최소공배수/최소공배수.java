import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        if (A <= B) {
            if (B % A == 0) {
                sb.append(B).append("\n");
            } else {
                for (long j = A-1; j >= 1; j--) {
                    if (A % j == 0 && B % j == 0) {
                        sb.append(A * B / j).append("\n");
                        break;
                    }
                }
            }
        } else {
            if (A % B == 0) {
                sb.append(A).append("\n");
            } else {
                for (long j = B - 1; j >= 1; j--) {
                    if (A % j == 0 && B % j == 0) {
                        sb.append(A * B / j).append("\n");
                        break;
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
