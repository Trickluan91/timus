package lab3;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1225">1225. Флаги</a><br><br>
 */

public class Task1225 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            int lines = in.nextInt();

            // w[i] - количество способов для i полосок, заканчивая белой
            // r[i] - количество способов для i полосок, заканчивая красной
            long[] w = new long[lines + 1];
            long[] r = new long[lines + 1];

            // База: одна полоска
            w[1] = 1; // белая
            r[1] = 1; // красная

            for (int i = 1; i < lines; i++) {
                r[i + 1] += w[i]; // После белой может идти красная
                if (i + 2 <= lines) {  // После белой может идти синяя-красная (занимаем 2 позиции)
                    r[i + 2] += w[i];
                }

                w[i + 1] += r[i]; // После красной может идти белая
                if (i + 2 <= lines) { // После красной может идти синяя-белая (занимаем 2 позиции)
                    w[i + 2] += r[i];
                }
            }

            System.out.println(w[lines] + r[lines]);
        } finally {
            in.close();
            out.flush();
        }
    }
}
