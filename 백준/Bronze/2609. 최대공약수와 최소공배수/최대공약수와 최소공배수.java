import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int maxValue = a > b ? a : b;
        int max=0;
        int minValue = a < b ? a : b;
        int min = 0;

        for (int i = 1; i <= maxValue; i++) {
            if (a % i == 0 && b % i == 0) {
                max = i;
            }
        }
        min = a * b / max;
        System.out.println(max);
        System.out.println(min);
    }
}
