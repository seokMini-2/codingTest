import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int M, N, cnt;
    static int[] row = {0, 0, 1, -1};
    static int[] col = {1, -1, 0, 0};

    public static boolean isSafe(int[][] arr, int x, int y) {
        if (x < N && y < M) {
            if ((x >= 0 && y >= 0) && arr[x][y] == 1) {
                return true;
            }
        }
        return false;
    }

    public static void find(int[][] arr, int x, int y) {
            arr[x][y] = 0;
            for (int l = 0; l < 4; l++) {
                int newX = x + row[l];
                int newY = y + col[l];
                if (isSafe(arr, newX, newY)) {
                    find(arr, newX, newY);
                }
            }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            cnt = 0;

            int[][] lett = new int[N][M];
            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int y = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());
                lett[x][y] = 1;
            }

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (lett[j][k] == 1) {
                        cnt++;
                        find(lett, j, k);
                    }
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}
