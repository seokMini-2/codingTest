import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        int x = 0, y = 0;
        if (b > 0 && e > 0) {
            for (int i = 1; i <= e; i++) {
                for (int j = 1; j <= b; j++) {
                    if (b * i == j * e) {
                        b = b * i;
                        a *= i;
                        c *= i;
                        e = b;
                        d *= j;
                        f *= j;
                        break;
                    }
                }
                if (e == b) {
                    break;
                }
            }
            x = (c - f) / (a - d);
            y = (c - a * x) / b;
            System.out.println(x + " " + y);
        } else if (b < 0 && e < 0) {
            for (int i = 1; i <= e*(-1); i++) {
                for (int j = 1; j <= b*(-1); j++) {
                    if (b * i == j * e) {
                        b = b * i;
                        a *= i;
                        c *= i;
                        e = b;
                        d *= j;
                        f *= j;
                        break;
                    }
                }
                if (e == b) {
                    break;
                }
            }
            x = (c - f) / (a - d);
            y = (c - a * x) / b;
            System.out.println(x + " " + y);

        } else if (b < 0 || e < 0) {

            if (b < 0) {
                for (int i = 1; i <= e; i++) {
                    for (int j = 1; j <= b * (-1); j++) {
                        if (b * i * (-1) == j * e) {
                            b = b * i;
                            a *= i;
                            c *= i;
                            e *= j;
                            d *= j;
                            f *= j;
                            break;
                        }
                    }
                    if (e * (-1) == b) {
                        break;
                    }
                }
                x = (c + f) / (a + d);
                y = (c - a * x) / b;
                System.out.println(x + " " + y);

            } else {
                for (int i = 1; i <= e * (-1); i++) {
                    for (int j = 1; j <= b; j++) {
                        if (b * i == j * e * (-1)) {
                            b = b * i;
                            a *= i;
                            c *= i;
                            e *= j;
                            d *= j;
                            f *= j;
                            break;
                        }
                    }
                    if (e * (-1) == b) {
                        break;
                    }
                }
                x = (c + f) / (a + d);
                y = (c - a * x) / b;
                System.out.println(x + " " + y);

            }

        } else {
            if (b == 0) {
                x = c / a;
                y = (f - d * x) / e;
            } else {
                x = f / d;
                y = (c - a * x) / b;
            }
            System.out.println(x + " " + y);
        }

    }
}
