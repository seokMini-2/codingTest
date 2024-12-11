import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int mom = 0, son = 0;
        int cnt=0;
        int answerCnt = 0;
        while (answerCnt < X) {
            mom = 0;
            son = 0;
            for (int i = 0; i <= cnt; i++) {
                if (cnt % 2 == 0) {
                    son = cnt - i;
                    mom = i;
                } else {
                    son = i;
                    mom = cnt - i;
                }

                answerCnt++;
                if (answerCnt == X) {
                    break;
                }
            }
            cnt++;
        }
        System.out.println((son+1)+"/"+(mom+1));
    }
}
