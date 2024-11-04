import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];

        int M = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            for (int j = x; j < y; j++) {
                int temp = arr[j-1];
                arr[j-1] = arr[y-1];
                arr[y-1] = temp;
                y--;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }


}