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
            int firstNum = Integer.parseInt(st.nextToken());
            int secNum = Integer.parseInt(st.nextToken());
            if (firstNum == 0 && secNum == 0) {
                break;
            }
            if (firstNum < secNum) {
                if (secNum % firstNum == 0) {
                    sb.append("factor\n");
                } else {
                    sb.append("neither\n");
                }
            } else {
                if (firstNum % secNum == 0) {
                    sb.append("multiple\n");
                } else {
                    sb.append("neither\n");
                }
            }
        }
        System.out.println(sb);

    }
}
