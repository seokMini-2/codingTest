import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static final int A = 1000001;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();


        boolean[] isPrime = new boolean[A];
        Arrays.fill(isPrime, true);

        for (int j = 2 ; j <= Math.sqrt(A) ; j++) {
            if (!isPrime[j]) continue;
            int idx = 2;
            while (j * idx <= A - 1) {
                isPrime[j * idx] = false;
                idx++;
            }
        }


        for (int i = 0; i < T; i++) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            int N = Integer.parseInt(br.readLine());
            for (int j = 2 ; j <= N ; j++) {
                if (isPrime[j]) arrayList.add(j);
            }

            int cnt = 0;
            int j = 0, k = arrayList.size() - 1;
            while (j <= k) {
                if (arrayList.get(j) + arrayList.get(k) < N) {
                    j++;
                } else if (arrayList.get(j) + arrayList.get(k) > N) {
                    k--;
                } else if (arrayList.get(j) + arrayList.get(k) == N) {
                    cnt++;
                    j++;
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}
