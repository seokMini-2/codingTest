import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        int[] arr = new int[26];
        for (int i = 0 ; i < 26 ; i++) {
            arr[i] = -1;
        }

        for (int i = 0 ; i < S.length() ; i++) {
        if (arr[S.charAt(i) - 'a'] != -1) continue;
            arr[S.charAt(i) - 'a'] = i;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
