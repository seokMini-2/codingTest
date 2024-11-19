import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        StringTokenizer st = new StringTokenizer(input, " ", true);
        StringBuilder a = new StringBuilder(st.nextToken());
        StringBuilder b = new StringBuilder(st.nextToken());
        StringBuilder c = new StringBuilder(st.nextToken());
        if (Integer.parseInt(String.valueOf(a.reverse())) >= Integer.parseInt(String.valueOf(c.reverse()))) {
            System.out.println(a);
        } else {
            System.out.println(c);
        }

    }
}