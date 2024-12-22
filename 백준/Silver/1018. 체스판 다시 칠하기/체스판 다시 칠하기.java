import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[][] arr = new String[N][M];
        for (int i = 0; i < N; i++) {
            String chess = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = String.valueOf(chess.charAt(j));
            }
        }
        int isDif = 0;
        int max = 0, min = 64;
        String[][] WB = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        WB[i][j] = "W";
                    } else {
                        WB[i][j] = "B";
                    }
                } else {
                    if (j % 2 == 0) {
                        WB[i][j] = "B";
                    } else {
                        WB[i][j] = "W";
                    }
                }
            }
        }
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        if (!arr[i + k][j + l].equals(WB[k][l])) {
                            isDif++;
                        }
                    }
                }
                if (isDif >= max) {
                    max = isDif;
                }
                if (isDif <= min) {
                    min = isDif;
                }
                isDif = 0;
            }
        }

        int answer = (64 - max) < min ? (64 - max) : min;
        System.out.println(answer);
    }
}
