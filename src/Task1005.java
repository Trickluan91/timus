import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <a href="https://acm.timus.ru/problem.aspx?space=1&num=1005">1005. Куча камней</a><br>
 * У вас есть несколько камней известного веса w1, …, wn. Напишите программу, которая распределит камни в две кучи так, что разность весов этих двух куч будет минимальной.<br><br>
 * <b>Исходные данные</b> <br>
 * Ввод содержит количество камней n (1 ≤ n ≤ 20) и веса камней w1, …, wn (1 ≤ wi ≤ 100 000) — целые, разделённые пробельными символами.
 * <br><br>
 * <b>Результат</b><br>
 * Ваша программа должна вывести одно число — минимальную разность весов двух куч.
 */

public class Task1005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        try {
            int n = in.nextInt();
            List<Integer> w = new ArrayList<>(n);
            while(in.hasNextInt()) {
                w.add(in.nextInt());
            }

            long total = w.stream().mapToLong(i -> i).sum();
            long best = Long.MAX_VALUE;

            //(1 << n) - это 2 в степени n, узнаем максимальное количество комбинаций
            //mask будет от 0 до 2 в степени n проверяться, то есть перебираются все комбинации сумм камней
            for (int mask = 0; mask < (1 << n); mask++) {
                long sum = 0;
                for (int i = 0; i < n; i++) {
                    //сдвигаем mask до i бита и проверяем, если i это единица, значит камень должен быть в этой куче
                    if (((mask >> i) & 1) == 1) {
                        sum += w.get(i);
                    }
                }
                //(вторая куча - первая куча)
                long diff = Math.abs(total - 2 * sum);
                if (diff < best) best = diff;
            }

            out.println(best);
        } finally {
            in.close();
            out.flush();
        }
    }
}
