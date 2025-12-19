package lab5;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1493">1493. В одном шаге от счастья</a>
 */

public class Task1493 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            int ticket = in.nextInt();

            if (isHappy(ticket + 1)) {
                out.println("Yes");
                return;
            }

            if (isHappy(ticket - 1)) {
                out.println("Yes");
                return;
            }

            out.println("No");
        } finally {
            in.close();
            out.flush();
        }
    }

    private static boolean isHappy(int num) {
        String s = String.format("%06d", num);

        int s1 = (s.charAt(0) - '0') + (s.charAt(1) - '0') + (s.charAt(2) - '0');
        int s2 = (s.charAt(3) - '0') + (s.charAt(4) - '0') + (s.charAt(5) - '0');

        return s1 == s2;
    }
}
