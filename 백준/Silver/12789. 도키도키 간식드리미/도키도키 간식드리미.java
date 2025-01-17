import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> before = new ArrayList<>();
        Stack<Integer> newLine = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            before.add(Integer.parseInt(st.nextToken()));
        }

        newLine.push(before.remove(0));
        boolean isNice = true;
        int i = 1;
        while (!newLine.isEmpty() && !before.isEmpty()) {
            if (before.get(0) == i || newLine.peek() == i) {
                if (before.get(0) == i) {
                    before.remove(0);
                } else {
                    newLine.pop();
                    if (newLine.isEmpty()) {
                        newLine.push(before.remove(0));
                    }
                }
                i++;
            } else if (newLine.peek() > before.get(0)) {
                newLine.push(before.remove(0));
            } else {
                isNice = false;
                break;
            }
        }

        if (isNice) {
            System.out.println("Nice");
        }else System.out.println("Sad");

    }
}
