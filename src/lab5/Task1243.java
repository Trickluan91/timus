package lab5;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1243">1243. Развод семи гномов</a>
 */

public class Task1243 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            int remainder = 0;
            for (char digit : in.nextLine().toCharArray()) {
                remainder = (remainder * 10 + (digit - '0')) % 7;
            }

            out.println(remainder);
        } finally {
            in.close();
            out.flush();
        }
    }
}
