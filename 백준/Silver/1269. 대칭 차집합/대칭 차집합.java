import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, String> A = new HashMap<>();
        HashMap<String, String> B = new HashMap<>();
        StringTokenizer stA = new StringTokenizer(br.readLine());
        String[] arr = new String[N];
        String[] brr = new String[M];
        for (int i = 0; i < N; i++) {
            String num = stA.nextToken();
            arr[i] = num;
            A.put(num, "i");
        }
        StringTokenizer stB = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            String num = stB.nextToken();
            brr[i] = num;
            B.put(num, "i");
        }

        int aN = N, bM = M;

        for (int i = 0; i < N; i++) {
            if (B.containsKey(arr[i])) {
                aN--;
            }
        }

        for (int i = 0; i < M; i++) {
            if (A.containsKey(brr[i])) {
                bM--;
            }
        }

        System.out.println(aN + bM);

    }
}
