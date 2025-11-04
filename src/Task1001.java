import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1001">1001. Обратный корень.</a>
 * <p>
 * Эта задача настолько проста, что авторы даже поленились сочинить для нее условие!
 * Исходные данные
 * Входной поток содержит набор целых чисел Ai (0 ≤ Ai ≤ 1018), отделённых друг от друга произвольным количеством пробелов и переводов строк. Размер входного потока не превышает 256 КБ.
 * <p>
 * Результат
 * Для каждого числа Ai, начиная с последнего и заканчивая первым, в отдельной строке вывести его квадратный корень не менее чем с четырьмя знаками после десятичной точки.
 *
 */

public class Task1001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        List<Double> ints = new ArrayList<>();
        try {
            while (in.hasNext()) {
                for (String s : in.next().split(" +")) {
                    ints.add(Double.parseDouble(s));
                }
            }
            for (int i = ints.size() - 1; i >= 0; i--) {
                out.println(String.format("%.4f", Math.sqrt(ints.get(i))));
            }
        } finally {
            in.close();
            out.flush();
        }
    }
}
