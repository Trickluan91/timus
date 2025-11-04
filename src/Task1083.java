import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1083">1083. Факториалы!!!</a><br>
 * <b>Определение 1.</b><br> n!!…! = n(n−k)(n−2k)…(n mod k), если n не делится на k; n!!…! = n(n−k)(n−2k)…k, если n делится на k (знаков ! в обоих случаях k штук).<br><br>
 * <b>Определение 2.</b><br> X mod Y — остаток от деления X на Y.<br><br>
 * Например, 10 mod 3 = 1; 3! = 3·2·1; 10!!! = 10·7·4·1.<br>
 * Мы по заданным n и k смогли вычислить значение выражения из определения 1. А вам слабо?<br><br>
 * <b>Исходные данные</b> <br>
 * В единственной строке сначала дано целое число n, 1 ≤ n ≤ 10, затем ровно один пробел, затем k восклицательных знаков, 1 ≤ k ≤ 20.
 * <br><br>
 * <b>Результат</b><br>
 * Выведите одно число — n!!…!
 */

public class Task1083 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            String[] s = in.nextLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int k  = s[1].length();
            int ans = 1;

            for (int i = n; i > 0; i -= k) {
                ans *= i;
            }

            out.println(ans);
        } finally {
            in.close();
            out.flush();
        }
    }
}
