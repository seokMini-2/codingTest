import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder answer;

    public static void Khan(int start, int length) {
        if (length == 1) {
            return;
        }
        int newLength = length / 3;
        for (int i = start + newLength; i < start + newLength * 2; i++) {
            answer.setCharAt(i, ' ');
        }
        Khan(start, newLength);
        Khan(start + newLength * 2, newLength);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        StringBuilder sb = new StringBuilder();
        while ((str = br.readLine()) != null) {
            int N = Integer.parseInt(str);
            answer = new StringBuilder();
            for (int i = 0; i < (int) Math.pow(3, N); i++) {
                answer.append("-");
            }
            Khan(0, answer.length());
            System.out.println(answer);
        }
    }
}
