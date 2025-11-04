import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1068">1068. Сумма</a><br>
 * Всё, что от вас требуется — найти сумму всех целых чисел, лежащих между 1 и N включительно.<br><br>
 * <b>Исходные данные</b> <br>
 * В единственной строке расположено число N, по модулю не превосходящее 10000.
 * <br><br>
 * <b>Результат</b><br>
 * Выведите целое число — ответ задачи
 */

public class Task1068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            int n = in.nextInt();
            int sum = n;
            while (n != 1) {
                if (n > 0) {
                    --n;
                } else {
                    ++n;
                }
                sum += n;
            }

            out.println(sum);
        } finally {
            in.close();
            out.flush();
        }
    }
}
