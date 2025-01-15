import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, String> company = new HashMap<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String inOut = st.nextToken();
            if (inOut.equals("leave")) {
                company.remove(name);
            } else {
                company.put(name, "enter");
            }
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arr = new ArrayList<>();
        arr.addAll(company.keySet());
        Collections.sort(arr, Collections.reverseOrder());
        for (String s : arr) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}
