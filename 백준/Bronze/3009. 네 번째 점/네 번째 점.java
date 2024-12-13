import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st1.nextToken());
        int y1 = Integer.parseInt(st1.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int x2 = Integer.parseInt(st2.nextToken());
        int y2 = Integer.parseInt(st2.nextToken());
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        int x3 = Integer.parseInt(st3.nextToken());
        int y3 = Integer.parseInt(st3.nextToken());
        if (x1 == x2) {
            if (y1 == y3) {
                System.out.println(x3 + " " + y2);
            } else if (y2 == y3) {
                System.out.println(x3 + " " + y1);
            }
        } else if (x1 == x3) {
            if (y1 == y2) {
                System.out.println(x2 + " " + y3);
            } else if (y2 == y3) {
                System.out.println(x2 + " " + y1);
            }
        } else {
            if (y1 == y3) {
                System.out.println(x1 + " " + y2);
            } else if (y1 == y2) {
                System.out.println(x1 + " " + y3);
            }
        }


    }
}
