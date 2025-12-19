package lab5;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1327">1327. Предохранители</a>
 */

public class Task1327 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            int begin = in.nextInt();
            int end = in.nextInt();

            int result = 0;
            int counter = 1;
            while (counter <= end) {
                if(counter >= begin) result++;
                counter += 2;
            }

            out.println(result);
        } finally {
            in.close();
            out.flush();
        }
    }
}
