package lab3;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1639">1639. Шоколад 2</a><br><br>
 */

public class Task1639 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            int m = in.nextInt();
            int n = in.nextInt();
            out.println((m * n) % 2 == 0 ? "[:=[first]" : "[second]=:]");
        } finally {
            in.close();
            out.flush();
        }
    }
}
