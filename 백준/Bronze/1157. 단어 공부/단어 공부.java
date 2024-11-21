import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] S = bf.readLine().toUpperCase().toCharArray();
        int[] alpha = new int[26];
        for (int i = 0; i < S.length; i++) {
            alpha[S[i] - 'A']++;
        }
        int max = 0;
        char answer = 'A';
        for (int i = 0; i < 26; i++) {
            if (max < alpha[i]) {
                max = alpha[i];
                answer=(char)('A'+i);
            } else if (max == alpha[i]){
                answer = '?';
            }
        }
        System.out.println(answer);
        
    }
}
