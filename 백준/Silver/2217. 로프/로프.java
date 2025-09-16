import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        boolean isChanged = false;
        int sum = 0;
        int maxSum = arr[0] * arr.length;
        for (int i = 1; i < N; i++) {
            if (arr[i] != arr[i - 1]) {
                int par = arr[i] * (N - i);
                if (par > maxSum) {
                    maxSum = par;
                }
            }
        }
        System.out.println(maxSum);
    }
}
