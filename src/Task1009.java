import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1009">1009. K-ичные числа</a><br>
 * Рассмотрим N-значные числа в системе счисления с основанием K. Будем считать число правильным, если его K-ичная запись не содержит двух подряд идущих нулей. Например: <br><br>
 *
 *     1010230 — правильное 7-значное число;<br>
 *     1000198 не является правильным числом;<br>
 *     0001235 — не 7-значное, а 4-значное число.<br><br>
 *
 * Даны числа N и K, вычислите количество правильных K-ичных чисел, состоящих из N цифр.
 * Ограничения: 2 ≤ K ≤ 10; N ≥ 2; N + K ≤ 18.<br><br>
 * <b>Исходные данные</b> <br>
 * Числа N и K в десятичной записи, разделенные переводом строки.
 * <br><br>
 * <b>Результат</b><br>
 * Искомое количество в десятичной записи.
 */

public class Task1009 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            int n = in.nextInt();
            int k = in.nextInt();

            int seq1 = k - 1;
            int seq2 = 0;

            for (int i = 2; i <= n; i++) {
                int newSeq1 = (seq1 + seq2) * (k - 1);
                int newSeq2 = seq1;
                seq1 = newSeq1;
                seq2 = newSeq2;
            }

            out.println(seq1 + seq2);
        } finally {
            in.close();
            out.flush();
        }
    }
}
