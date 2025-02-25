import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int recNum;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            String S = br.readLine();
            recNum = 0;
            sb.append(isPalindrome(S)).append(" ").append(recNum).append("\n");
        }
        System.out.println(sb);
    }

    static int isPalindrome(String S) {
        return recursion(S, 0, S.length() - 1);
    }

    static int recursion(String S, int s, int l) {
        recNum++;
        if (s >= l) {
            return 1;
        } else if (S.charAt(s) != S.charAt(l)) {
            return 0;
        }
        return recursion(S, s + 1, l - 1);
    }
}
