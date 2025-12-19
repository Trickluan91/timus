package lab6;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1349">1349. Ферма</a>
 */

public class Task1349 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            int n = in.nextInt();
            //теорема Ферма
            if (n == 1) {
                out.println("1 2 3");
            } else if (n == 2) {
                out.println("3 4 5");
            } else {
                out.println("-1");
            }
        } finally {
            in.close();
            out.flush();
        }
    }
}
