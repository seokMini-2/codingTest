import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int time = Integer.parseInt(st.nextToken());
            arr[i] = time;
        }
        Arrays.sort(arr);
        int[] newArr = new int[N];
        newArr[0] = arr[0];
        for (int i = 1; i < N; i++) {
            newArr[i] = newArr[i - 1] + arr[i];
        }
        int sum = 0;
        for (int i : newArr) {
            sum += i;
        }
        System.out.println(sum);
    }
}
