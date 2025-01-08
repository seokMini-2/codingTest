import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    for (int i = 0; i < o1.length(); i++) {
                        if (o1.charAt(i) != o2.charAt(i)) {
                            return o1.charAt(i) - o2.charAt(i);
                        }
                    }
                } else {
                    return o1.length() - o2.length();
                }
                return 0;
            }
        });
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arr2 = new ArrayList<>();
        for (String s : arr) {
            if (!arr2.contains(s)) {
                arr2.add(s);
            }
        }
        for (String s : arr2) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);


    }
}
