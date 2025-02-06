import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            HashMap<String, Integer> fashion = new HashMap<>();
            int m = Integer.parseInt(br.readLine());
            for (int j = 0; j < m; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String option = st.nextToken();
                fashion.put(option, fashion.getOrDefault(option, 0) + 1);
            }
            int answer = 1;
            for (Integer value : fashion.values()) {
                answer *= (value + 1);
            }
            sb.append(answer - 1).append("\n");
        }
        System.out.println(sb);
    }
}
