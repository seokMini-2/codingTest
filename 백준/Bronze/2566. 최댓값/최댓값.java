import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[9][9];
        int maxValue = 0, maxN = 0, maxM = 0;
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] >= maxValue) {
                    maxValue = arr[i][j];
                    maxN = i+1;
                    maxM = j+1;
                }
            }
        }
        System.out.println(maxValue);
        System.out.println(maxN + " " + maxM);
    }
}