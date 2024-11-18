import java.util.Scanner;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int l = sc.nextInt();
//            sc.nextLine();
            String sen = sc.next();
            Repeat(l, sen);
        }
        System.out.println(sb.toString());



    }
    static void Repeat(int i, String s){
        for (int j = 0; j < s.length(); j++) {
            for (int k = 0; k < i; k++) {
               sb.append(s.charAt(j));
            }
        }
        sb.append("\n");
    }
}