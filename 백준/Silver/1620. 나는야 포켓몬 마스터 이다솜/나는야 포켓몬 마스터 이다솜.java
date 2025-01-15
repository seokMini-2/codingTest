import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String,Integer> poketmon = new HashMap<>();
        HashMap<Integer,String> poketmon2 = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            poketmon.put(name, i);
            poketmon2.put(i, name);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String Q = br.readLine();
            if (poketmon.get(Q) != null) {
                sb.append(poketmon.get(Q)).append("\n");
            } else {
                sb.append(poketmon2.get(Integer.parseInt(Q))).append("\n");
            }
        }
        System.out.println(sb);
    }
}
