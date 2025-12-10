package lab4;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1319">1319. Отель</a><br><br>
 */

public class Task1319 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            int n  = in.nextInt();
            int[][] matrix = new int[n][n];
            int cnt = 1;

            for (int d = 0; d <= 2 * (n - 1); d++) {
                for (int i = 0; i < n; i++) {
                    int j = (n - 1) - (d - i);
                    if (j >= 0 && j < n) {
                        matrix[i][j] = cnt++;
                    }
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    sb.append(matrix[i][j]);
                    if (j + 1 < n) sb.append(" ");
                }
                sb.append('\n');
            }

            System.out.print(sb);

        } finally {
            in.close();
            out.flush();
        }
    }
}
