import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(factor(N));
    }

    static long factor(int N) {
        if (N == 0) {
            return 1;
        }
        return N * factor(N - 1);
    }
}
