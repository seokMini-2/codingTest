import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static int count;

    public static void DFS(boolean[][] arr, int start) {
        visited[start] = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[start][i] && !visited[i]) {
                count++;
                DFS(arr, i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int com = Integer.parseInt(br.readLine());
        int line = Integer.parseInt(br.readLine());
        boolean[][] arr = new boolean[com + 1][com + 1];
        visited = new boolean[com + 1];
        for (int i = 0; i < line; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = arr[b][a] = true;
        }
        DFS(arr, 1);
        System.out.println(count);

    }
}
