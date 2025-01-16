import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        Set<String> set = new HashSet<>();
        int cnt = 1;
        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < S.length() - i; j++) {
                set.add(S.substring(j, j + cnt));
            }
            cnt++;
        }
        System.out.println(set.size());
    }
}
