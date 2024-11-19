import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String S = bf.readLine();
        int sum = 0;
        for (char s : S.toCharArray()) {
            sum += time(s);
        }
        System.out.println(sum);

    }

    static int time(char S) {
        int num = 0;
        int answer = S - 'A';
        if (answer <= 2) {
            num = 3;
        } else if (answer > 2 && answer <= 5) {
            num = 4;
        } else if (answer > 5 && answer <= 8) {
            num = 5;
        } else if (answer > 8 && answer <= 11) {
            num = 6;
        } else if (answer > 11 && answer <= 14) {
            num = 7;
        } else if (answer > 14 && answer <= 18) {
            num = 8;
        } else if (answer > 18 && answer <= 21) {
            num = 9;
        } else if (answer > 21 && answer <= 25) {
            num = 10;
        }
        return num;
    }
}
