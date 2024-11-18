
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
            char c = S.charAt(i);
            for (int j = 0 ; j < 26 ; j++) {
                    if (c == 'a' + j && arr[j] == -1) {
                        arr[j] = i;
                        break;
                    }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }


    }
}
