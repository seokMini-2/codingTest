import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int times = 2 * N - 1;
        String[] star = new String[times];
        for (int i = 0; i < times; i++) {
            star[i] = " ";
        }
        star[N - 1] = "*";

        for (int i = 0; i < times; i++) {
            if (i < N) {
                star[N - 1 - i] = "*";
                star[N - 1 + i] = "*";
                for (int j = 0; j < N + i; j++) {
                    System.out.print(star[j]);
                }
                System.out.println();
            } else{
                star[i - N] = " ";
                star[times - 1 - (i - N)] = " ";
                for (int k =0 ; k < times - 1 - (i - N); k++) {
                    System.out.print(star[k]);
                }
                if (i != times - 1) {
                    System.out.println();
                }
            }

        }
    }
}