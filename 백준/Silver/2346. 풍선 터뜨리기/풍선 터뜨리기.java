import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        Deque<Integer> dequeNum = new ArrayDeque<>();
        int[] arr = new int[N];
        for (int i = 1; i <= N; i++) {
            deque.offer(i);
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            dequeNum.offer(Integer.parseInt(st.nextToken()));
        }
        arr[0] = deque.poll();
        int a = dequeNum.poll();
        int j = 1;
        while (j < N) {
            if (a > 0) {
                for (int i = 0; i < a; i++) {
                    deque.offer(deque.poll());
                    dequeNum.offer(dequeNum.poll());
                }
                arr[j] = deque.pollLast();
                a = dequeNum.pollLast();
            } else {
                for (int i = 0; i < a * -1; i++) {
                    deque.offerFirst(deque.pollLast());
                    dequeNum.offerFirst(dequeNum.pollLast());
                }
                arr[j] = deque.poll();
                a = dequeNum.poll();
            }
            j++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);

    }
}
