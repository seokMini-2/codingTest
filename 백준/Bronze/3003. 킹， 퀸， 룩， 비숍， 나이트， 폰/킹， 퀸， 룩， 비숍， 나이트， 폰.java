import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String chess = bf.readLine();
        StringTokenizer st = new StringTokenizer(chess);
        StringBuilder sb = new StringBuilder();

        int[] name = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < 6; i++) {
            sb.append(name[i] - Integer.parseInt(st.nextToken()) + " ");
        }
        System.out.println(sb);

    }
}