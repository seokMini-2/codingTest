import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] sorted;
    static int staticK;
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        staticK = Integer.parseInt(st.nextToken());
        int[] a = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        merge_sort(a);
        if (cnt < staticK) {
            System.out.println(-1);
        }

    }

    public static void merge_sort(int[] a) {
        sorted = new int[a.length];
        merge_sort(a, 0, a.length - 1);
    }

    public static void merge_sort(int[] a, int left, int right) {
        if (left == right) {
            return;
        }
        int mid = (left + right) / 2;
        merge_sort(a, left, mid);
        merge_sort(a, mid+1, right);
        merge(a, left, mid, right);

    }

    public static void merge(int[] a, int left, int mid, int right) {
        int idx = left;
        int l = left;
        int r = mid + 1;
        while (l <= mid && r <= right) {
            if (a[l] <= a[r]) {
                sorted[idx] = a[l];
                l++;
                idx++;
            } else {
                sorted[idx] = a[r];
                r++;
                idx++;
            }
        }

        if (l > mid) {
            while(r<=right){
                sorted[idx] = a[r];
                idx++;
                r++;
            }
        } else{
            while (l <= mid) {
                sorted[idx] = a[l];
                idx++;
                l++;
            }
        }
        for (int i = left; i <= right; i++) {
            cnt++;
            a[i] = sorted[i];
            if (cnt == staticK) {
                System.out.println(a[i]);
                return;
            }
        }
    }
}
