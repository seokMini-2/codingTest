import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int V = scanner.nextInt();
        int cnt=0;
        for (int i : arr) {
            if (i == V) {
                cnt++;
            }
        }
        System.out.println(cnt);


    }
}