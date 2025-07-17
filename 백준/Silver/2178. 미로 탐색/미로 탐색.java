import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{
    static int N, M;
    static int[] row = {0, 0, 1, -1};
    static int[] col = {1, -1, 0, 0};
    static Queue<Integer> queue;

    public static boolean isSafe(int[][] arr, int x, int y, boolean[][] visited) {
        if ((x >= 0 && y >= 0) && (x < N && y < M)) {
            if (!visited[x][y] && arr[x][y] == 1) {
                return true;
            }
        }
        return false;
    }

    public static void BFS(int[][] arr, int x, int y, boolean[][] visited) {
        queue.offer(x);
        queue.offer(y);
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            x = queue.poll();
            y = queue.poll();

            for (int i = 0; i < 4; i++) {
                int newX = x + row[i];
                int newY = y + col[i];
                if (isSafe(arr, newX, newY, visited)) {
                    queue.offer(newX);
                    queue.offer(newY);
                    visited[newX][newY] = true;
                    arr[newX][newY] = arr[x][y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        boolean[][] visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(String.valueOf(line.charAt(j)));
            }
        }
        queue = new ArrayDeque<>();
        BFS(arr, 0, 0, visited);
        System.out.println(arr[N - 1][M - 1]);

    }
}