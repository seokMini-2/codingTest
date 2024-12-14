import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int max = a;
            int b = Integer.parseInt(st.nextToken());
            if (b > max) {
                max = b;
            }
            int c = Integer.parseInt(st.nextToken());
            if (c > max) {
                max = c;
            }
            if (a == 0 && b == 0 && c == 0) {
                break;
            }
            if (2 * max < a + b + c) {
                if (a == b && b == c) {
                    sb.append("Equilateral\n");
                } else if (a == b || b == c || a == c) {
                    sb.append("Isosceles\n");
                } else {
                    sb.append("Scalene\n");
                }
            } else {
                sb.append("Invalid\n");
            }

        }
        System.out.println(sb);

    }
}
