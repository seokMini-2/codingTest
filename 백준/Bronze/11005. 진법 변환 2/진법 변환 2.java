import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int S = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        while (S != 0) {
            if (S % N >= 10) {
                sb.append((char) (S % N + 55));
            } else {
                sb.append(S % N);
            }
            S /= N;
        }
        System.out.println(sb.reverse());

    }
}