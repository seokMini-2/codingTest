import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] grade = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0"};
        double sum = 0;
        double scoreSum=0;
        double avg = 0;

        for (int i = 0; i < 20; i++) {
            double great = 4.5;
            StringTokenizer st = new StringTokenizer(br.readLine());
            String whichSubject = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            scoreSum += score;
            String AAA = st.nextToken();

            for (String s : grade) {
                if (AAA.equals(s)) {
                    sum += score * great;
                    break;
                } else if (AAA.equals("F")) {
                    sum += 0;
                    break;
                } else if (AAA.equals("P")) {
                    scoreSum -= score;
                    break;
                }
                great -= 0.5;

            }

        }
        avg = sum / scoreSum;
        System.out.println(avg);

    }
}