package lab7;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1296">1296. Гиперпереход</a>
 */

public class Task1296 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            in.nextInt();
            int currentSum = 0, maxSum = 0;

            while(in.hasNextInt()) {
                int next = in.nextInt();
                currentSum = Math.max(next, currentSum + next);
                maxSum = Math.max(maxSum, currentSum);
            }

            out.println(maxSum);
        } finally {
            in.close();
            out.flush();
        }
    }
}
