package lab7;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1149">1149. Танцы синуса</a>
 */

public class Task1149 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            int n = in.nextInt();
            StringBuilder result = new StringBuilder();

            result.append(buildAn(1));
            result.append("+");
            result.append(n);

            for (int i = 2; i <= n; i++) {
                result.insert(0, "(");
                result.append(")");
                result.append(buildAn(i));
                result.append("+");
                result.append(n - i + 1);
            }

            out.println(result);
        } finally {
            in.close();
            out.flush();
        }
    }

    public static String buildAn(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < n; i++) {
            result.append("sin(");
            result.append(i);
            result.append(i % 2 == 1 ? "-" : "+");
        }

        result.append("sin(");
        result.append(n);

        for (int i = 0; i < n; i++) {
            result.append(")");
        }

        return result.toString();
    }
}
