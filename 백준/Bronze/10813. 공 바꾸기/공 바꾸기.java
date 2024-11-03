import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = (i + 1);
        }

        for (int i = 0; i < M; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int temp = arr[x - 1];
            arr[x - 1] = arr[y - 1];
            arr[y - 1] = temp;
        }

        for (int i : arr) {
            System.out.print(i+" ");

        }
    }
}
