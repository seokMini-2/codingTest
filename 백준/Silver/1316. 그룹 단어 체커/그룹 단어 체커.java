import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = N;
        for (int i = 0; i < N; i++) {
            char[] S = br.readLine().toCharArray();
            int[] alpha = new int[26];
            alpha[S[0]-'a']++;
            for (int j = 0; j < S.length-1; j++) {
                if (S[j] != S[j + 1] && alpha[S[j + 1] - 'a'] != 0) {
                    cnt--;
                    break;
                }
                alpha[S[j+1] - 'a']++;
            }
        }
        System.out.println(cnt);

    }
}