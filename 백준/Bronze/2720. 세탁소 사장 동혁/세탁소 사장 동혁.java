import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int Quarter = 0, Dime = 0, Nickel = 0, Penny = 0;

            Quarter += N / 25;
            sb.append(Quarter).append(" ");
            N %= 25;

            Dime += N / 10;
            sb.append(Dime).append(" ");
            N %= 10;

            Nickel += N / 5;
            sb.append(Nickel).append(" ");
            N %= 5;

            Penny += N / 1;
            sb.append(Penny).append("\n");
        }
        System.out.println(sb.toString());
    }
}
