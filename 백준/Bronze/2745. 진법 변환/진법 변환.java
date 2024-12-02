import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int[] arr = new int[B];
        for (int i = 0; i < B; i++) {
            if (i >= 10) {
                arr[i] = 'A' + i - 10;
            } else {
                arr[i] = i;
            }
        }
        int answer = 0;

        for (int i = 0; i < N.length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (isNum(N.charAt(i))) {// 숫자가 들어왔을 때
                    if (arr[j] == Integer.parseInt(String.valueOf(N.charAt(i)))) {
                        answer += (int) (j * Math.pow(B, N.length() - 1 - i));
                        break;
                    }
                } else { // 문자가 들어왔을 때
                    if (arr[j] == N.charAt(i)) {
                        answer += (int) (j * Math.pow(B, N.length() - 1 - i));
                        break;
                    }
                }

            }
        }
        System.out.println(answer);

    }

    private static boolean isNum(char c) {
        return 48 <= c && c <= 57;
    }
}