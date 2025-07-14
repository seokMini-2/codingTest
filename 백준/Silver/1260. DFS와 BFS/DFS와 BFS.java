import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] edge_Arr;
    static boolean[] visited_Arr;
    static int N, M, V, count;
    static Queue<Integer> que = new LinkedList<>();

    public static void BFS(int start) {
        que.offer(start);
        visited_Arr[start] = true;
        System.out.print(start + " ");

        while (!que.isEmpty()) {
            start = que.poll();

            for (int i = 1; i <= N; i++) {
                if (edge_Arr[start][i] == 1 && visited_Arr[i] == false) {
                    que.offer(i);
                    visited_Arr[i]=true;
                    System.out.print(i + " ");
                }
            }
        }

    }

    public static void DFS(int start) {
        visited_Arr[start]=true;
        System.out.print(start + " ");
        if (count == N) {
            return;
        }
        count++;

        for (int i = 1; i <= N; i++) {
            if (edge_Arr[start][i] == 1 && visited_Arr[i] == false) {
                DFS(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        edge_Arr=new int[N+1][N+1];
        visited_Arr = new boolean[N+1];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());
            edge_Arr[row][col] = edge_Arr[col][row] = 1;
        }
        DFS(V);
        System.out.println();
        visited_Arr = new boolean[N+1];
        BFS(V);
    }
}
