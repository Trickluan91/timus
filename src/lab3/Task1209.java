package lab3;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1209"></a><br><br>
 */

public class Task1209 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            StringBuilder result = new StringBuilder();
            int n =  in.nextInt();

            for (int i = 0; i < n; i++) {
                int K = in.nextInt();

                long p = (long) Math.ceil((Math.sqrt(1 + 8.0 * K) - 3) / 2.0);
                long before = p * (p + 1) / 2; // Вычисляем сумму длины всех чисел до p-1:
                long posInside = K - before; // Позиция внутри числа 10^p

                result.append((posInside == 1) ? '1' : '0').append(' '); // теперь K — позиция внутри числа 10^p
            }

            out.println(result);
        } finally {
            in.close();
            out.flush();
        }
    }
}
