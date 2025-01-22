import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int cnt1 = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        fibo(n);
        System.out.println(cnt1 + " " + (n - 2));
    }

    static int fibo(int n) {
        if (n == 1 || n == 2) {
            cnt1++;
            return 1;
        } else {
            return fibo(n - 2) + fibo(n - 1);
        }
    }
}
