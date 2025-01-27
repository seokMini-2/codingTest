import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        HashSet<Integer> hashSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if (s.equals("all")) {
                hashSet.clear();
                for (int j = 1; j <= 20; j++) {
                    hashSet.add(j);
                }
            } else if (s.equals("empty")) {
                hashSet.clear();
            } else if (s.equals("add")) {
                int x = Integer.parseInt(st.nextToken());
                hashSet.add(x);
            } else if (s.equals("remove")) {
                int x = Integer.parseInt(st.nextToken());
                hashSet.remove(x);
            } else if (s.equals("check")) {
                int x = Integer.parseInt(st.nextToken());
                if (hashSet.contains(x)) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else {
                int x = Integer.parseInt(st.nextToken());
                if (hashSet.contains(x)) {
                    hashSet.remove(x);
                } else {
                    hashSet.add(x);
                }
            }
        }
        System.out.println(sb);
    }
}
