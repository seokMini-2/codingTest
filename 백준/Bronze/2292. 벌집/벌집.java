import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 1, i = 0;
        while (sum < N) {
            i++;
            sum += i * 6;
        }
        System.out.println(i + 1);
    }
}
