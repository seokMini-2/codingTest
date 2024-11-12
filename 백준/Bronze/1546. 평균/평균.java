import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] score = new int[N];

        for (int i = 0; i < N; i++) {
            score[i] = scanner.nextInt();
        }

        int sum = 0;
        int max = score[0];
        for (int i : score) {
            if (max < i) {
                max = i;
            }
            sum += i;
        }
        double avg = (double) sum / max * 100 / N;
        System.out.println(avg);

    }
}