import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            }
            int sum = 0, cnt = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    cnt++;
                }
            }
            int[] arr = new int[cnt];

            if (sum == n) {
                int j = 0;
                for (int i = 1; i < n; i++) {
                    if (n % i == 0) {
                        arr[j] = i;
                        j++;
                    }
                }
                sb.append(n + " =");
                for (int i = 0; i < cnt; i++) {
                    if (i != cnt - 1) {
                        sb.append(" " + arr[i] + " +");
                    } else {
                        sb.append(" " + arr[i]+"\n");
                    }
                }
            } else {
                sb.append(n + " is NOT perfect.\n");
            }
        }
        System.out.println(sb);
    }
}
