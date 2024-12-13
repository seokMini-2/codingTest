import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0, cnt = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = M; i <= N; i++) {
            boolean isRight = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isRight = false;
                    break;
                }
            }
            if (isRight) {
                if (i != 1) {
                    list.add(i);
                    cnt++;
                    sum += i;
                    }
                }
        }
        if (cnt != 0) {
            System.out.println(sum);
            System.out.println(list.get(0));
        } else {
            System.out.println(-1);
        }

    }
}
