package lab3;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1313">1313. К вопросу о спорте</a><br><br>
 */

public class Task1313 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            int a = in.nextInt();
            int[][] arr = new int[a][a];
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    arr[i][j] = in.nextInt();
                }
            }

            for (int d = 0; d <= (2 * a - 2); d++) {
                int startRow = Math.min(d, a - 1);
                int endRow = Math.max(0, d - (a - 1));
                for (int i = startRow; i >= endRow; i--) {
                    int j = d - i;
                    sb.append(arr[i][j]).append(' ');
                }
            }

            out.println(sb);
        } finally {
            in.close();
            out.flush();
        }
    }
}
