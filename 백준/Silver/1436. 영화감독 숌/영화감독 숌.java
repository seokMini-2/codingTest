import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int min = 666;
        int devilCnt = 0;
        while (true) {
            char[] arr = String.valueOf(min).toCharArray();
            int cntSix = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '6') {
                    cntSix++;
                } else {
                    cntSix = 0;
                }

                if (cntSix == 3) {
                    devilCnt++;
                }
            }
            if (devilCnt == N) {
                System.out.println(min);
                break;
            }
            min++;
        }
    }
}
