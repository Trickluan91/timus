package lab4;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1581">1581. Работа в команде</a><br><br>
 */

public class Task1581 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            in.nextInt();

            StringBuilder sb = new StringBuilder();
            int count = 1;
            int digit = in.nextInt();

            while (in.hasNextInt()) {
                int next = in.nextInt();
                if (next != digit) {
                    sb.append(count).append(' ');
                    sb.append(digit).append(' ');
                    count = 1;
                    digit = next;
                } else {
                    count++;
                }
            }

            sb.append(count).append(' ');
            sb.append(digit);

            out.println(sb);
        } finally {
            in.close();
            out.flush();
        }
    }
}
