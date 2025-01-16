import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, String> noLis = new HashMap<>();

        for (int i = 0; i < N; i++) {
            noLis.put(br.readLine(), "i");
        }
        StringBuilder sb = new StringBuilder();
        List<String> nerd = new ArrayList<>();
        int cnt = 0;
        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (noLis.containsKey(name)) {
                cnt++;
                nerd.add(name);
            }
        }
        Collections.sort(nerd);
        sb.append(cnt).append("\n");
        for (String s : nerd) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}
