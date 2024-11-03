
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt()%42;
        }
        int cnt=0;

        for (int i = 0; i < 10; i++) {
            boolean check = true;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    check = false;
                }
            }
            if(check){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
