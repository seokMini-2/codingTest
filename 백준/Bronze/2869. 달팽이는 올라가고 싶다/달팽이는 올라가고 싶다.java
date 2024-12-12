import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());
        int days = 1;

        if ((height - up) % (up - down) == 0) {
            days += (height - up) / (up - down);
        } else {
            days += (height - up) / (up - down) + 1;
        }
        System.out.println(days);
    }
}