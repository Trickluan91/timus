import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1000">1000. A+B Problem</a>
 * <p>
 * Вычислите a+b
 * <p>
 * <br>Исходные данные</br>
 * a и b
 * <br>Результат</br>
 * a+b
 */

public class Task1000 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            int a = in.nextInt();
            int b = in.nextInt();
            out.println(a + b);
        } finally {
            in.close();
            out.flush();
        }
    }
}
