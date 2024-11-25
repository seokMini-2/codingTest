import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] arr = new String[5][15];

        for (int i = 0; i < 5; i++) {
            String S = br.readLine();
            for (int j = 0; j <15; j++) {
                if (j >= S.length()) {
                    arr[i][j] = " ";
                } else {
                    arr[i][j] = String.valueOf(S.charAt(j));
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                sb.append(arr[i][j]);
            }
        }
        StringTokenizer st = new StringTokenizer(sb.toString());
        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken());
        }
    }
}