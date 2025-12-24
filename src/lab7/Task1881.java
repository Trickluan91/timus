package lab7;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1881">1881. Длинное условие задачи</a>
 */

public class Task1881 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            int rows = in.nextInt(), charsByRow = in.nextInt(), words = in.nextInt();

            int cursorOnChar = 0, cursorOnRow = 1;
            for (int i = 0; i < words; i++) {
                int word = in.next().length();
                if (cursorOnChar != 0 && cursorOnChar + word > charsByRow) {
                    cursorOnRow++;
                    cursorOnChar = 0;
                }
                cursorOnChar += word + 1;
            }

            out.println((cursorOnRow + rows - 1) / rows);
        } finally {
            in.close();
            out.flush();
        }
    }
}
