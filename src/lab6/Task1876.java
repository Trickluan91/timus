package lab6;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1876">1876. Утро сороконожки</a>
 */

public class Task1876 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            int leftLegs = in.nextInt(), rightLegs = in.nextInt();
            out.println(Math.max(2 * leftLegs + 39, 2 * rightLegs + 40));
        } finally {
            in.close();
            out.flush();
        }
    }
}
