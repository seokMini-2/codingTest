import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String answer = sc.nextLine();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(String.valueOf(answer.charAt(i)));
        }

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);

    }
}