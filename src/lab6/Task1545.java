package lab6;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1545">1545. Иероглифы</a>
 */

public class Task1545 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            int charsCount = in.nextInt();
            String[] chars = new String[charsCount];

            for (int i = 0; i < charsCount; i++) {
                chars[i] = in.next();
            }

            String searchChar =  in.next();

            for (String chr : chars) {
                if (chr.startsWith(searchChar)) {
                    out.println(chr);
                }
            }
        } finally {
            in.close();
            out.flush();
        }
    }
}
