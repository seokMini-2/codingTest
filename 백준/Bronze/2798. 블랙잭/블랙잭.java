import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i]=Integer.parseInt(st2.nextToken());
        }
        int sum = 0;
        int gap = M;
        for (int i = 0; i < N-2; i++) {
            sum += arr[i];
            for (int j = i + 1; j < N - 1; j++) {
                sum += arr[j];
                for (int k = j + 1; k < N; k++) {
                    sum += arr[k];
                    if (M - sum < 0) {
                        sum -= arr[k];
                        continue;
                    }
                    if (M - sum < gap) {
                        gap = M - sum;
                    }
                    sum -= arr[k];
                }
                sum -= arr[j];
            }
            sum -= arr[i];
        }
        System.out.println(M - gap);
    }
}


