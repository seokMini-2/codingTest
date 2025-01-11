import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(br.readLine());
            Boolean isSuper = true;
            while (isSuper) {
                if (arr[i] == 0 | arr[i] == 1) {
                    sb.append(2).append("\n");
                    break;
                }
                for (long j = 2; j <= Math.sqrt(arr[i]); j++) {
                    if (arr[i] % j == 0) {
                        isSuper = false;
                        break;
                    }
                }
                if (!isSuper) {
                    arr[i]++;
                    isSuper = true;
                } else {
                    sb.append(arr[i]).append("\n");
                    break;
                }
            }
        }
        System.out.println(sb);

    }
}
