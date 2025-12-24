package lab7;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1636">1636. Штрафное время</a>
 */

public class Task1636 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            int qxx = in.nextInt(), zzz = in.nextInt();

            int penaltyZZZ = 0;
            for (int i = 0; i < 10; i++) {
                penaltyZZZ += in.nextInt();
            }

            out.println(qxx > (zzz - penaltyZZZ * 20) ? "Dirty debug :(" : "No chance.");
        } finally {
            in.close();
            out.flush();
        }
    }
}
