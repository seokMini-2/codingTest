import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            int angle = Integer.parseInt(br.readLine());
            arr[i] = angle;
            sum += angle;
        }
        if (sum == 180) {
            if (arr[0] == arr[1] && arr[0] == arr[2]) {
                System.out.println("Equilateral");
            } else if (arr[1] == arr[2] || arr[0] == arr[1] || arr[0] == arr[2]) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }
    }
}
